package typings.vegaLite

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcGuideMod.FormatMixins
import typings.vegaLite.srcGuideMod.Guide
import typings.vegaLite.srcGuideMod.VlOnlyGuideConfig
import typings.vegaLite.vegaLiteStrings.align
import typings.vegaLite.vegaLiteStrings.anchor
import typings.vegaLite.vegaLiteStrings.angle
import typings.vegaLite.vegaLiteStrings.aria
import typings.vegaLite.vegaLiteStrings.baseline
import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.dx
import typings.vegaLite.vegaLiteStrings.dy
import typings.vegaLite.vegaLiteStrings.font
import typings.vegaLite.vegaLiteStrings.fontSize
import typings.vegaLite.vegaLiteStrings.fontStyle
import typings.vegaLite.vegaLiteStrings.fontWeight
import typings.vegaLite.vegaLiteStrings.format
import typings.vegaLite.vegaLiteStrings.formatType
import typings.vegaLite.vegaLiteStrings.frame
import typings.vegaLite.vegaLiteStrings.header
import typings.vegaLite.vegaLiteStrings.headerColumn
import typings.vegaLite.vegaLiteStrings.headerFacet
import typings.vegaLite.vegaLiteStrings.headerRow
import typings.vegaLite.vegaLiteStrings.labelAlign
import typings.vegaLite.vegaLiteStrings.labelAnchor
import typings.vegaLite.vegaLiteStrings.labelAngle
import typings.vegaLite.vegaLiteStrings.labelBaseline
import typings.vegaLite.vegaLiteStrings.labelColor
import typings.vegaLite.vegaLiteStrings.labelExpr
import typings.vegaLite.vegaLiteStrings.labelFont
import typings.vegaLite.vegaLiteStrings.labelFontSize
import typings.vegaLite.vegaLiteStrings.labelFontStyle
import typings.vegaLite.vegaLiteStrings.labelFontWeight
import typings.vegaLite.vegaLiteStrings.labelLimit
import typings.vegaLite.vegaLiteStrings.labelLineHeight
import typings.vegaLite.vegaLiteStrings.labelOrient
import typings.vegaLite.vegaLiteStrings.labelPadding
import typings.vegaLite.vegaLiteStrings.labels
import typings.vegaLite.vegaLiteStrings.limit
import typings.vegaLite.vegaLiteStrings.lineHeight
import typings.vegaLite.vegaLiteStrings.offset
import typings.vegaLite.vegaLiteStrings.orient
import typings.vegaLite.vegaLiteStrings.subtitleColor
import typings.vegaLite.vegaLiteStrings.subtitleFont
import typings.vegaLite.vegaLiteStrings.subtitleFontSize
import typings.vegaLite.vegaLiteStrings.subtitleFontStyle
import typings.vegaLite.vegaLiteStrings.subtitleFontWeight
import typings.vegaLite.vegaLiteStrings.subtitleLineHeight
import typings.vegaLite.vegaLiteStrings.subtitlePadding
import typings.vegaLite.vegaLiteStrings.titleAlign
import typings.vegaLite.vegaLiteStrings.titleAnchor
import typings.vegaLite.vegaLiteStrings.titleAngle
import typings.vegaLite.vegaLiteStrings.titleBaseline
import typings.vegaLite.vegaLiteStrings.titleColor
import typings.vegaLite.vegaLiteStrings.titleFont
import typings.vegaLite.vegaLiteStrings.titleFontSize
import typings.vegaLite.vegaLiteStrings.titleFontStyle
import typings.vegaLite.vegaLiteStrings.titleFontWeight
import typings.vegaLite.vegaLiteStrings.titleLimit
import typings.vegaLite.vegaLiteStrings.titleLineHeight
import typings.vegaLite.vegaLiteStrings.titleOrient
import typings.vegaLite.vegaLiteStrings.titlePadding
import typings.vegaLite.vegaLiteStrings.zindex
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Orient
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("vega-lite/build/src/header", "HEADER_CONFIGS")
  @js.native
  val HEADER_CONFIGS: js.Array[header | headerRow | headerColumn | headerFacet] = js.native
  
  @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES")
  @js.native
  val HEADER_LABEL_PROPERTIES: js.Array[
    orient | titleAlign | titleAnchor | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labelAlign | labelBaseline | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelPadding | format | formatType | titleAngle | labels | labelLineHeight | labelAngle | labelExpr | labelAnchor | labelOrient
  ] = js.native
  
  /* Inlined std.Partial<std.Record<keyof vega-lite.vega-lite/build/src/header.CoreHeader<any>, keyof vega.vega.TitleConfig>> */
  object HEADER_LABEL_PROPERTIES_MAP {
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.format")
    @js.native
    def format: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.formatType")
    @js.native
    def formatType: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def formatType_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def format_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAlign_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelAnchor")
    @js.native
    def labelAnchor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAnchor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelAngle")
    @js.native
    def labelAngle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAngle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelBaseline_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelColor")
    @js.native
    def labelColor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelColor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelExpr")
    @js.native
    def labelExpr: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelExpr_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelExpr")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelFont")
    @js.native
    def labelFont: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontSize_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontStyle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontWeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFont_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelLimit_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelLineHeight")
    @js.native
    def labelLineHeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelLineHeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelOrient")
    @js.native
    def labelOrient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelOrient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOrient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelPadding_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.labels")
    @js.native
    def labels: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labels_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.orient")
    @js.native
    def orient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | typings.vegaLite.vegaLiteStrings.orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def orient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAlign_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAnchor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleAngle")
    @js.native
    def titleAngle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAngle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleBaseline_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleColor")
    @js.native
    def titleColor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleColor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleFont")
    @js.native
    def titleFont: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontSize_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontStyle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontWeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFont_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleLimit_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleLineHeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titleOrient")
    @js.native
    def titleOrient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleOrient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOrient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_LABEL_PROPERTIES_MAP.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titlePadding_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES")
  @js.native
  val HEADER_TITLE_PROPERTIES: js.Array[
    orient | titleAlign | titleAnchor | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labelAlign | labelBaseline | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelPadding | format | formatType | titleAngle | labels | labelLineHeight | labelAngle | labelExpr | labelAnchor | labelOrient
  ] = js.native
  
  /* Inlined std.Partial<std.Record<keyof vega-lite.vega-lite/build/src/header.CoreHeader<any>, keyof vega.vega.TitleConfig>> */
  object HEADER_TITLE_PROPERTIES_MAP {
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.format")
    @js.native
    def format: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.formatType")
    @js.native
    def formatType: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def formatType_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def format_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAlign_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelAnchor")
    @js.native
    def labelAnchor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAnchor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelAngle")
    @js.native
    def labelAngle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelAngle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelBaseline_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelColor")
    @js.native
    def labelColor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelColor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelExpr")
    @js.native
    def labelExpr: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelExpr_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelExpr")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelFont")
    @js.native
    def labelFont: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontSize_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontStyle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelFontWeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFont_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelLimit_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelLineHeight")
    @js.native
    def labelLineHeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelLineHeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelOrient")
    @js.native
    def labelOrient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelOrient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOrient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labelPadding_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.labels")
    @js.native
    def labels: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def labels_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.orient")
    @js.native
    def orient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | typings.vegaLite.vegaLiteStrings.orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def orient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAlign_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAnchor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleAngle")
    @js.native
    def titleAngle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleAngle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleBaseline_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleColor")
    @js.native
    def titleColor: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleColor_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleFont")
    @js.native
    def titleFont: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontSize_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontStyle_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleFontWeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFont_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleLimit_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleLineHeight_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titleOrient")
    @js.native
    def titleOrient: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titleOrient_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOrient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/header", "HEADER_TITLE_PROPERTIES_MAP.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[
        subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
      ] = js.native
    @scala.inline
    def titlePadding_=(
      x: js.UndefOr[
          subtitleFont | fontWeight | lineHeight | color | dx | anchor | aria | offset | subtitlePadding | fontStyle | limit | orient | font | subtitleFontStyle | fontSize | baseline | angle | subtitleFontWeight | subtitleColor | zindex | frame | dy | subtitleFontSize | subtitleLineHeight | align
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CoreHeader[ES /* <: ExprRef | SignalRef */] extends FormatMixins {
    
    /**
      * Horizontal text alignment of header labels. One of `"left"`, `"center"`, or `"right"`.
      */
    var labelAlign: js.UndefOr[Align | ES] = js.native
    
    /**
      * The anchor position for placing the labels. One of `"start"`, `"middle"`, or `"end"`. For example, with a label orientation of top these anchor positions map to a left-, center-, or right-aligned label.
      */
    var labelAnchor: js.UndefOr[TitleAnchor] = js.native
    
    /**
      * The rotation angle of the header labels.
      *
      * __Default value:__ `0` for column header, `-90` for row header.
      *
      * @minimum -360
      * @maximum 360
      */
    var labelAngle: js.UndefOr[Double] = js.native
    
    /**
      * The vertical text baseline for the header labels. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`.
      * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the `titleLineHeight` rather than `titleFontSize` alone.
      *
      */
    var labelBaseline: js.UndefOr[TextBaseline | ES] = js.native
    
    /**
      * The color of the header label, can be in hex color code or regular color name.
      */
    var labelColor: js.UndefOr[Color | ES] = js.native
    
    /**
      * The font of the header label.
      */
    var labelFont: js.UndefOr[String | ES] = js.native
    
    /**
      * The font size of the header label, in pixels.
      *
      * @minimum 0
      */
    var labelFontSize: js.UndefOr[Double | ES] = js.native
    
    /**
      * The font style of the header label.
      */
    var labelFontStyle: js.UndefOr[FontStyle | ES] = js.native
    
    /**
      * The font weight of the header label.
      */
    var labelFontWeight: js.UndefOr[FontWeight | ES] = js.native
    
    /**
      * The maximum length of the header label in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0`, indicating no limit
      */
    var labelLimit: js.UndefOr[Double | ES] = js.native
    
    /**
      * Line height in pixels for multi-line header labels or title text with `"line-top"` or `"line-bottom"` baseline.
      */
    var labelLineHeight: js.UndefOr[Double | ES] = js.native
    
    /**
      * The orientation of the header label. One of `"top"`, `"bottom"`, `"left"` or `"right"`.
      */
    var labelOrient: js.UndefOr[Orient] = js.native
    
    /**
      * The padding, in pixel, between facet header's label and the plot.
      *
      * __Default value:__ `10`
      */
    var labelPadding: js.UndefOr[Double | ES] = js.native
    
    /**
      * A boolean flag indicating if labels should be included as part of the header.
      *
      * __Default value:__ `true`.
      */
    var labels: js.UndefOr[Boolean] = js.native
    
    /**
      * Shortcut for setting both labelOrient and titleOrient.
      */
    var orient: js.UndefOr[Orient] = js.native
    
    /**
      * Horizontal text alignment (to the anchor) of header titles.
      */
    var titleAlign: js.UndefOr[Align | ES] = js.native
    
    /**
      * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
      */
    var titleAnchor: js.UndefOr[TitleAnchor] = js.native
    
    /**
      * The rotation angle of the header title.
      *
      * __Default value:__ `0`.
      *
      * @minimum -360
      * @maximum 360
      */
    var titleAngle: js.UndefOr[Double] = js.native
    
    /**
      * The vertical text baseline for the header title. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`.
      * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the `titleLineHeight` rather than `titleFontSize` alone.
      *
      * __Default value:__ `"middle"`
      */
    var titleBaseline: js.UndefOr[TextBaseline | ES] = js.native
    
    /**
      * Color of the header title, can be in hex color code or regular color name.
      */
    var titleColor: js.UndefOr[Color | ES] = js.native
    
    /**
      * Font of the header title. (e.g., `"Helvetica Neue"`).
      */
    var titleFont: js.UndefOr[String | ES] = js.native
    
    /**
      * Font size of the header title.
      *
      * @minimum 0
      */
    var titleFontSize: js.UndefOr[Double | ES] = js.native
    
    /**
      * The font style of the header title.
      */
    var titleFontStyle: js.UndefOr[FontStyle | ES] = js.native
    
    /**
      * Font weight of the header title.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var titleFontWeight: js.UndefOr[FontWeight | ES] = js.native
    
    /**
      * The maximum length of the header title in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0`, indicating no limit
      */
    var titleLimit: js.UndefOr[Double | ES] = js.native
    
    /**
      * Line height in pixels for multi-line header title text or title text with `"line-top"` or `"line-bottom"` baseline.
      */
    var titleLineHeight: js.UndefOr[Double | ES] = js.native
    
    /**
      * The orientation of the header title. One of `"top"`, `"bottom"`, `"left"` or `"right"`.
      */
    var titleOrient: js.UndefOr[Orient] = js.native
    
    /**
      * The padding, in pixel, between facet header's title and the label.
      *
      * __Default value:__ `10`
      */
    var titlePadding: js.UndefOr[Double | ES] = js.native
  }
  object CoreHeader {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): CoreHeader[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreHeader[ES]]
    }
    
    @scala.inline
    implicit class CoreHeaderMutableBuilder[Self <: CoreHeader[_], ES /* <: ExprRef | SignalRef */] (val x: Self with CoreHeader[ES]) extends AnyVal {
      
      @scala.inline
      def setLabelAlign(value: Align | ES): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAnchor(value: TitleAnchor): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAnchorNull: Self = StObject.set(x, "labelAnchor", null)
      
      @scala.inline
      def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
      
      @scala.inline
      def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(value: TextBaseline | ES): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(value: Color | ES): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(value: String | ES): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(value: Double | ES): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(value: FontStyle | ES): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(value: FontWeight | ES): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(value: Double | ES): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(value: Double | ES): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      @scala.inline
      def setLabelOrient(value: Orient): Self = StObject.set(x, "labelOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOrientUndefined: Self = StObject.set(x, "labelOrient", js.undefined)
      
      @scala.inline
      def setLabelPadding(value: Double | ES): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setOrient(value: Orient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setTitleAlign(value: Align | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(value: TitleAnchor): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(value: Double): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(value: TextBaseline | ES): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: Color | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(value: String | ES): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double | ES): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(value: FontStyle | ES): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(value: FontWeight | ES): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(value: Double | ES): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(value: Double | ES): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOrient(value: Orient): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(value: Double | ES): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vegaLite.srcGuideMod.FormatMixins because Already inherited
  - typings.vegaLite.headerMod.CoreHeader because var conflicts: format, formatType, labelExpr. Inlined titleAnchor, titleAlign, titleAngle, titleBaseline, titleColor, titleFont, titleFontSize, titleFontStyle, titleFontWeight, titleLimit, titleLineHeight, titleOrient, titlePadding, labels, labelAlign, labelBaseline, labelAnchor, labelAngle, labelColor, labelFont, labelFontSize, labelFontStyle, labelFontWeight, labelLimit, labelLineHeight, labelOrient, labelPadding, orient */ @js.native
  trait Header[ES /* <: ExprRef | SignalRef */] extends Guide {
    
    /**
      * Horizontal text alignment of header labels. One of `"left"`, `"center"`, or `"right"`.
      */
    var labelAlign: js.UndefOr[Align | ES] = js.native
    
    /**
      * The anchor position for placing the labels. One of `"start"`, `"middle"`, or `"end"`. For example, with a label orientation of top these anchor positions map to a left-, center-, or right-aligned label.
      */
    var labelAnchor: js.UndefOr[TitleAnchor] = js.native
    
    /**
      * The rotation angle of the header labels.
      *
      * __Default value:__ `0` for column header, `-90` for row header.
      *
      * @minimum -360
      * @maximum 360
      */
    var labelAngle: js.UndefOr[Double] = js.native
    
    /**
      * The vertical text baseline for the header labels. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`.
      * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the `titleLineHeight` rather than `titleFontSize` alone.
      *
      */
    var labelBaseline: js.UndefOr[TextBaseline | ES] = js.native
    
    /**
      * The color of the header label, can be in hex color code or regular color name.
      */
    var labelColor: js.UndefOr[Color | ES] = js.native
    
    /**
      * The font of the header label.
      */
    var labelFont: js.UndefOr[String | ES] = js.native
    
    /**
      * The font size of the header label, in pixels.
      *
      * @minimum 0
      */
    var labelFontSize: js.UndefOr[Double | ES] = js.native
    
    /**
      * The font style of the header label.
      */
    var labelFontStyle: js.UndefOr[FontStyle | ES] = js.native
    
    /**
      * The font weight of the header label.
      */
    var labelFontWeight: js.UndefOr[FontWeight | ES] = js.native
    
    /**
      * The maximum length of the header label in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0`, indicating no limit
      */
    var labelLimit: js.UndefOr[Double | ES] = js.native
    
    /**
      * Line height in pixels for multi-line header labels or title text with `"line-top"` or `"line-bottom"` baseline.
      */
    var labelLineHeight: js.UndefOr[Double | ES] = js.native
    
    /**
      * The orientation of the header label. One of `"top"`, `"bottom"`, `"left"` or `"right"`.
      */
    var labelOrient: js.UndefOr[Orient] = js.native
    
    /**
      * The padding, in pixel, between facet header's label and the plot.
      *
      * __Default value:__ `10`
      */
    var labelPadding: js.UndefOr[Double | ES] = js.native
    
    /**
      * A boolean flag indicating if labels should be included as part of the header.
      *
      * __Default value:__ `true`.
      */
    var labels: js.UndefOr[Boolean] = js.native
    
    /**
      * Shortcut for setting both labelOrient and titleOrient.
      */
    var orient: js.UndefOr[Orient] = js.native
    
    /**
      * Horizontal text alignment (to the anchor) of header titles.
      */
    var titleAlign: js.UndefOr[Align | ES] = js.native
    
    /**
      * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
      */
    var titleAnchor: js.UndefOr[TitleAnchor] = js.native
    
    /**
      * The rotation angle of the header title.
      *
      * __Default value:__ `0`.
      *
      * @minimum -360
      * @maximum 360
      */
    var titleAngle: js.UndefOr[Double] = js.native
    
    /**
      * The vertical text baseline for the header title. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`.
      * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the `titleLineHeight` rather than `titleFontSize` alone.
      *
      * __Default value:__ `"middle"`
      */
    var titleBaseline: js.UndefOr[TextBaseline | ES] = js.native
    
    /**
      * Color of the header title, can be in hex color code or regular color name.
      */
    var titleColor: js.UndefOr[Color | ES] = js.native
    
    /**
      * Font of the header title. (e.g., `"Helvetica Neue"`).
      */
    var titleFont: js.UndefOr[String | ES] = js.native
    
    /**
      * Font size of the header title.
      *
      * @minimum 0
      */
    var titleFontSize: js.UndefOr[Double | ES] = js.native
    
    /**
      * The font style of the header title.
      */
    var titleFontStyle: js.UndefOr[FontStyle | ES] = js.native
    
    /**
      * Font weight of the header title.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var titleFontWeight: js.UndefOr[FontWeight | ES] = js.native
    
    /**
      * The maximum length of the header title in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0`, indicating no limit
      */
    var titleLimit: js.UndefOr[Double | ES] = js.native
    
    /**
      * Line height in pixels for multi-line header title text or title text with `"line-top"` or `"line-bottom"` baseline.
      */
    var titleLineHeight: js.UndefOr[Double | ES] = js.native
    
    /**
      * The orientation of the header title. One of `"top"`, `"bottom"`, `"left"` or `"right"`.
      */
    var titleOrient: js.UndefOr[Orient] = js.native
    
    /**
      * The padding, in pixel, between facet header's title and the label.
      *
      * __Default value:__ `10`
      */
    var titlePadding: js.UndefOr[Double | ES] = js.native
  }
  object Header {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): Header[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Header[ES]]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header[_], ES /* <: ExprRef | SignalRef */] (val x: Self with Header[ES]) extends AnyVal {
      
      @scala.inline
      def setLabelAlign(value: Align | ES): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAnchor(value: TitleAnchor): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAnchorNull: Self = StObject.set(x, "labelAnchor", null)
      
      @scala.inline
      def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
      
      @scala.inline
      def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(value: TextBaseline | ES): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(value: Color | ES): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(value: String | ES): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(value: Double | ES): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(value: FontStyle | ES): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(value: FontWeight | ES): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(value: Double | ES): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(value: Double | ES): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      @scala.inline
      def setLabelOrient(value: Orient): Self = StObject.set(x, "labelOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOrientUndefined: Self = StObject.set(x, "labelOrient", js.undefined)
      
      @scala.inline
      def setLabelPadding(value: Double | ES): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setOrient(value: Orient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setTitleAlign(value: Align | ES): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(value: TitleAnchor): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(value: Double): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(value: TextBaseline | ES): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(value: Color | ES): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(value: String | ES): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double | ES): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(value: FontStyle | ES): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(value: FontWeight | ES): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(value: Double | ES): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(value: Double | ES): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOrient(value: Orient): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(value: Double | ES): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    }
  }
  
  @js.native
  trait HeaderConfig[ES /* <: ExprRef | SignalRef */]
    extends CoreHeader[ES]
       with VlOnlyGuideConfig
  object HeaderConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): HeaderConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderConfig[ES]]
    }
  }
  
  @js.native
  trait HeaderConfigMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Header configuration, which determines default properties for all [headers](https://vega.github.io/vega-lite/docs/header.html).
      *
      * For a full list of header configuration options, please see the [corresponding section of in the header documentation](https://vega.github.io/vega-lite/docs/header.html#config).
      */
    var header: js.UndefOr[HeaderConfig[ES]] = js.native
    
    /**
      * Header configuration, which determines default properties for column [headers](https://vega.github.io/vega-lite/docs/header.html).
      *
      * For a full list of header configuration options, please see the [corresponding section of in the header documentation](https://vega.github.io/vega-lite/docs/header.html#config).
      */
    var headerColumn: js.UndefOr[HeaderConfig[ES]] = js.native
    
    /**
      * Header configuration, which determines default properties for non-row/column facet [headers](https://vega.github.io/vega-lite/docs/header.html).
      *
      * For a full list of header configuration options, please see the [corresponding section of in the header documentation](https://vega.github.io/vega-lite/docs/header.html#config).
      */
    var headerFacet: js.UndefOr[HeaderConfig[ES]] = js.native
    
    /**
      * Header configuration, which determines default properties for row [headers](https://vega.github.io/vega-lite/docs/header.html).
      *
      * For a full list of header configuration options, please see the [corresponding section of in the header documentation](https://vega.github.io/vega-lite/docs/header.html#config).
      */
    var headerRow: js.UndefOr[HeaderConfig[ES]] = js.native
  }
  object HeaderConfigMixins {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): HeaderConfigMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderConfigMixins[ES]]
    }
    
    @scala.inline
    implicit class HeaderConfigMixinsMutableBuilder[Self <: HeaderConfigMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with HeaderConfigMixins[ES]) extends AnyVal {
      
      @scala.inline
      def setHeader(value: HeaderConfig[ES]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColumn(value: HeaderConfig[ES]): Self = StObject.set(x, "headerColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColumnUndefined: Self = StObject.set(x, "headerColumn", js.undefined)
      
      @scala.inline
      def setHeaderFacet(value: HeaderConfig[ES]): Self = StObject.set(x, "headerFacet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFacetUndefined: Self = StObject.set(x, "headerFacet", js.undefined)
      
      @scala.inline
      def setHeaderRow(value: HeaderConfig[ES]): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowUndefined: Self = StObject.set(x, "headerRow", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
