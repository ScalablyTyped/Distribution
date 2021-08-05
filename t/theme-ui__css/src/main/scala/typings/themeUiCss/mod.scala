package typings.themeUiCss

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.themeUiCss.themeUiCssStrings.borderStyles
import typings.themeUiCss.themeUiCssStrings.borderWidths
import typings.themeUiCss.themeUiCssStrings.borders
import typings.themeUiCss.themeUiCssStrings.colors
import typings.themeUiCss.themeUiCssStrings.fontSizes
import typings.themeUiCss.themeUiCssStrings.fontWeights
import typings.themeUiCss.themeUiCssStrings.fonts
import typings.themeUiCss.themeUiCssStrings.letterSpacings
import typings.themeUiCss.themeUiCssStrings.lineHeights
import typings.themeUiCss.themeUiCssStrings.opacities
import typings.themeUiCss.themeUiCssStrings.radii
import typings.themeUiCss.themeUiCssStrings.shadows
import typings.themeUiCss.themeUiCssStrings.sizes
import typings.themeUiCss.themeUiCssStrings.space
import typings.themeUiCss.themeUiCssStrings.transitions
import typings.themeUiCss.themeUiCssStrings.zIndices
import typings.themeUiCss.typesMod.CSSObject
import typings.themeUiCss.typesMod.ColorModesScale
import typings.themeUiCss.typesMod.Scale
import typings.themeUiCss.typesMod.ThemeStyles
import typings.themeUiCss.typesMod.ThemeUICSSProperties
import typings.themeUiCss.typesMod.ThemeUIStyleObject
import typings.themeUiCss.typesMod.ThemeUITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@theme-ui/css/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def css(): js.Function1[/* props */ js.UndefOr[CssPropsArgument], CSSObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[js.Function1[/* props */ js.UndefOr[CssPropsArgument], CSSObject]]
  inline def css(args: ThemeUIStyleObject): js.Function1[/* props */ js.UndefOr[CssPropsArgument], CSSObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[CssPropsArgument], CSSObject]]
  
  @JSImport("@theme-ui/css/dist", "defaultBreakpoints")
  @js.native
  val defaultBreakpoints: js.Array[String] = js.native
  
  inline def get(obj: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: js.Any, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: js.Any, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: Unit, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: String, `def`: Unit, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: js.Any, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: js.Any, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: Unit, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Double, `def`: Unit, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: js.Any, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: js.Any, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: Unit, p: Double, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Object, key: Unit, `def`: Unit, p: Unit, undef: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any], undef.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object multiples {
    
    @JSImport("@theme-ui/css/dist", "multiples")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@theme-ui/css/dist", "multiples.marginX")
    @js.native
    def marginX: js.Array[String] = js.native
    inline def marginX_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginX")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.marginY")
    @js.native
    def marginY: js.Array[String] = js.native
    inline def marginY_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginY")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.paddingX")
    @js.native
    def paddingX: js.Array[String] = js.native
    inline def paddingX_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.paddingY")
    @js.native
    def paddingY: js.Array[String] = js.native
    inline def paddingY_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.scrollPaddingX")
    @js.native
    def scrollPaddingX: js.Array[String] = js.native
    inline def scrollPaddingX_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPaddingX")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.scrollPaddingY")
    @js.native
    def scrollPaddingY: js.Array[String] = js.native
    inline def scrollPaddingY_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPaddingY")(x.asInstanceOf[js.Any])
    
    @JSImport("@theme-ui/css/dist", "multiples.size")
    @js.native
    def size: js.Array[String] = js.native
    inline def size_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
  }
  
  object scales {
    
    @JSImport("@theme-ui/css/dist", "scales.backgroundColor")
    @js.native
    val backgroundColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.blockSize")
    @js.native
    val blockSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.border")
    @js.native
    val border: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlock")
    @js.native
    val borderBlock: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockEnd")
    @js.native
    val borderBlockEnd: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockEndStyle")
    @js.native
    val borderBlockEndStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockEndWidth")
    @js.native
    val borderBlockEndWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockStart")
    @js.native
    val borderBlockStart: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockStartStyle")
    @js.native
    val borderBlockStartStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockStartWidth")
    @js.native
    val borderBlockStartWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockStyle")
    @js.native
    val borderBlockStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBlockWidth")
    @js.native
    val borderBlockWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottom")
    @js.native
    val borderBottom: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottomColor")
    @js.native
    val borderBottomColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottomLeftRadius")
    @js.native
    val borderBottomLeftRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottomRightRadius")
    @js.native
    val borderBottomRightRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottomStyle")
    @js.native
    val borderBottomStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderBottomWidth")
    @js.native
    val borderBottomWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderColor")
    @js.native
    val borderColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderEndEndRadius")
    @js.native
    val borderEndEndRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderEndStartRadius")
    @js.native
    val borderEndStartRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInline")
    @js.native
    val borderInline: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineEnd")
    @js.native
    val borderInlineEnd: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineEndStyle")
    @js.native
    val borderInlineEndStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineEndWidth")
    @js.native
    val borderInlineEndWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineStart")
    @js.native
    val borderInlineStart: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineStartStyle")
    @js.native
    val borderInlineStartStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineStartWidth")
    @js.native
    val borderInlineStartWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineStyle")
    @js.native
    val borderInlineStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderInlineWidth")
    @js.native
    val borderInlineWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderLeft")
    @js.native
    val borderLeft: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderLeftColor")
    @js.native
    val borderLeftColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderLeftStyle")
    @js.native
    val borderLeftStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderLeftWidth")
    @js.native
    val borderLeftWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderRadius")
    @js.native
    val borderRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderRight")
    @js.native
    val borderRight: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderRightColor")
    @js.native
    val borderRightColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderRightStyle")
    @js.native
    val borderRightStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderRightWidth")
    @js.native
    val borderRightWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderStartEndRadius")
    @js.native
    val borderStartEndRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderStartStartRadius")
    @js.native
    val borderStartStartRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderStyle")
    @js.native
    val borderStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTop")
    @js.native
    val borderTop: borders = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTopColor")
    @js.native
    val borderTopColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTopLeftRadius")
    @js.native
    val borderTopLeftRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTopRightRadius")
    @js.native
    val borderTopRightRadius: radii = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTopStyle")
    @js.native
    val borderTopStyle: borderStyles = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderTopWidth")
    @js.native
    val borderTopWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.borderWidth")
    @js.native
    val borderWidth: borderWidths = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.bottom")
    @js.native
    val bottom: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.boxShadow")
    @js.native
    val boxShadow: shadows = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.caretColor")
    @js.native
    val caretColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.color")
    @js.native
    val color: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.columnGap")
    @js.native
    val columnGap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.columnRuleColor")
    @js.native
    val columnRuleColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.fill")
    @js.native
    val fill: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.flexBasis")
    @js.native
    val flexBasis: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.fontFamily")
    @js.native
    val fontFamily: fonts = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.fontSize")
    @js.native
    val fontSize: fontSizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.fontWeight")
    @js.native
    val fontWeight: fontWeights = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.gap")
    @js.native
    val gap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.gridColumnGap")
    @js.native
    val gridColumnGap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.gridGap")
    @js.native
    val gridGap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.gridRowGap")
    @js.native
    val gridRowGap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.height")
    @js.native
    val height: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.inlineSize")
    @js.native
    val inlineSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.inset")
    @js.native
    val inset: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetBlock")
    @js.native
    val insetBlock: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetBlockEnd")
    @js.native
    val insetBlockEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetBlockStart")
    @js.native
    val insetBlockStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetInline")
    @js.native
    val insetInline: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetInlineEnd")
    @js.native
    val insetInlineEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.insetInlineStart")
    @js.native
    val insetInlineStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.left")
    @js.native
    val left: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.letterSpacing")
    @js.native
    val letterSpacing: letterSpacings = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.lineHeight")
    @js.native
    val lineHeight: lineHeights = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.margin")
    @js.native
    val margin: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginBlock")
    @js.native
    val marginBlock: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginBlockEnd")
    @js.native
    val marginBlockEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginBlockStart")
    @js.native
    val marginBlockStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginBottom")
    @js.native
    val marginBottom: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginInline")
    @js.native
    val marginInline: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginInlineEnd")
    @js.native
    val marginInlineEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginInlineStart")
    @js.native
    val marginInlineStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginLeft")
    @js.native
    val marginLeft: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginRight")
    @js.native
    val marginRight: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginTop")
    @js.native
    val marginTop: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginX")
    @js.native
    val marginX: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.marginY")
    @js.native
    val marginY: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.maxBlockSize")
    @js.native
    val maxBlockSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.maxHeight")
    @js.native
    val maxHeight: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.maxInlineSize")
    @js.native
    val maxInlineSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.maxWidth")
    @js.native
    val maxWidth: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.minBlockSize")
    @js.native
    val minBlockSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.minHeight")
    @js.native
    val minHeight: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.minInlineSize")
    @js.native
    val minInlineSize: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.minWidth")
    @js.native
    val minWidth: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.opacity")
    @js.native
    val opacity: opacities = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.outlineColor")
    @js.native
    val outlineColor: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.padding")
    @js.native
    val padding: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingBlock")
    @js.native
    val paddingBlock: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingBlockEnd")
    @js.native
    val paddingBlockEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingBlockStart")
    @js.native
    val paddingBlockStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingBottom")
    @js.native
    val paddingBottom: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingInline")
    @js.native
    val paddingInline: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingInlineEnd")
    @js.native
    val paddingInlineEnd: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingInlineStart")
    @js.native
    val paddingInlineStart: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingLeft")
    @js.native
    val paddingLeft: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingRight")
    @js.native
    val paddingRight: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingTop")
    @js.native
    val paddingTop: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingX")
    @js.native
    val paddingX: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.paddingY")
    @js.native
    val paddingY: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.right")
    @js.native
    val right: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.rowGap")
    @js.native
    val rowGap: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPadding")
    @js.native
    val scrollPadding: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingBottom")
    @js.native
    val scrollPaddingBottom: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingLeft")
    @js.native
    val scrollPaddingLeft: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingRight")
    @js.native
    val scrollPaddingRight: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingTop")
    @js.native
    val scrollPaddingTop: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingX")
    @js.native
    val scrollPaddingX: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.scrollPaddingY")
    @js.native
    val scrollPaddingY: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.size")
    @js.native
    val size: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.stroke")
    @js.native
    val stroke: colors = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.textShadow")
    @js.native
    val textShadow: shadows = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.top")
    @js.native
    val top: space = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.transition")
    @js.native
    val transition: transitions = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.width")
    @js.native
    val width: sizes = js.native
    
    @JSImport("@theme-ui/css/dist", "scales.zIndex")
    @js.native
    val zIndex: zIndices = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.themeUiCss.anon.Theme
    - typings.themeUiCss.typesMod.Theme
  */
  trait CssPropsArgument extends StObject
  object CssPropsArgument {
    
    inline def apply(): CssPropsArgument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssPropsArgument]
    }
    
    extension [Self <: CssPropsArgument](x: Self) {
      
      inline def setAlerts(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
      
      inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
      
      inline def setBadges(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
      
      inline def setBorderStyles(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any
            ]
      ): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
      
      inline def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
      
      inline def setBorderStylesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
      ): Self = StObject.set(x, "borderStyles", js.Array(value :_*))
      
      inline def setBorderWidths(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLengthStyledSystem> */ js.Any
            ]
      ): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
      
      inline def setBorderWidthsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLengthStyledSystem> */ js.Any)*
      ): Self = StObject.set(x, "borderWidths", js.Array(value :_*))
      
      inline def setBorders(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any
            ]
      ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      inline def setBordersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
      ): Self = StObject.set(x, "borders", js.Array(value :_*))
      
      inline def setBreakpoints(value: js.Array[String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setBreakpointsVarargs(value: String*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      inline def setButtons(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setCards(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
      
      inline def setColorStyles(value: Scale[ThemeUICSSProperties]): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
      
      inline def setColorStylesUndefined: Self = StObject.set(x, "colorStyles", js.undefined)
      
      inline def setColorStylesVarargs(value: ThemeUICSSProperties*): Self = StObject.set(x, "colorStyles", js.Array(value :_*))
      
      inline def setColors(value: ColorModesScale): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setFontSizes(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any
            ]
      ): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      inline def setFontSizesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any)*
      ): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      inline def setFontWeights(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any
            ]
      ): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
      
      inline def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
      
      inline def setFontWeightsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any)*
      ): Self = StObject.set(x, "fontWeights", js.Array(value :_*))
      
      inline def setFonts(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any
            ]
      ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any)*
      ): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      inline def setForms(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
      
      inline def setGrids(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "grids", value.asInstanceOf[js.Any])
      
      inline def setGridsUndefined: Self = StObject.set(x, "grids", js.undefined)
      
      inline def setImages(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setInitialColorModeName(value: String): Self = StObject.set(x, "initialColorModeName", value.asInstanceOf[js.Any])
      
      inline def setInitialColorModeNameUndefined: Self = StObject.set(x, "initialColorModeName", js.undefined)
      
      inline def setLayout(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLetterSpacings(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLengthStyledSystem> */ js.Any
            ]
      ): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
      
      inline def setLetterSpacingsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLengthStyledSystem> */ js.Any)*
      ): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
      
      inline def setLineHeights(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLengthStyledSystem> */ js.Any
            ]
      ): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
      
      inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
      
      inline def setLineHeightsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLengthStyledSystem> */ js.Any)*
      ): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
      
      inline def setLinks(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
      
      inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
      
      inline def setMessages(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOpacities(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any
            ]
      ): Self = StObject.set(x, "opacities", value.asInstanceOf[js.Any])
      
      inline def setOpacitiesUndefined: Self = StObject.set(x, "opacities", js.undefined)
      
      inline def setOpacitiesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any)*
      ): Self = StObject.set(x, "opacities", js.Array(value :_*))
      
      inline def setPrintColorModeName(value: String): Self = StObject.set(x, "printColorModeName", value.asInstanceOf[js.Any])
      
      inline def setPrintColorModeNameUndefined: Self = StObject.set(x, "printColorModeName", js.undefined)
      
      inline def setRadii(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLengthStyledSystem> */ js.Any
            ]
      ): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
      
      inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
      
      inline def setRadiiVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLengthStyledSystem> */ js.Any)*
      ): Self = StObject.set(x, "radii", js.Array(value :_*))
      
      inline def setShadows(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any
            ]
      ): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShadowsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any)*
      ): Self = StObject.set(x, "shadows", js.Array(value :_*))
      
      inline def setSizes(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any
            ]
      ): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any)*
      ): Self = StObject.set(x, "sizes", js.Array(value :_*))
      
      inline def setSpace(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any
            ]
      ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setSpaceVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any)*
      ): Self = StObject.set(x, "space", js.Array(value :_*))
      
      inline def setStyles(value: ThemeStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: Record[String, ThemeUIStyleObject]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextStyles(value: Scale[ThemeUICSSProperties]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
      
      inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
      
      inline def setTextStylesVarargs(value: ThemeUICSSProperties*): Self = StObject.set(x, "textStyles", js.Array(value :_*))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTransitions(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition */ js.Any
            ]
      ): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTransitionsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition */ js.Any)*
      ): Self = StObject.set(x, "transitions", js.Array(value :_*))
      
      inline def setUseBodyStyles(value: Boolean): Self = StObject.set(x, "useBodyStyles", value.asInstanceOf[js.Any])
      
      inline def setUseBodyStylesUndefined: Self = StObject.set(x, "useBodyStyles", js.undefined)
      
      inline def setUseBorderBox(value: Boolean): Self = StObject.set(x, "useBorderBox", value.asInstanceOf[js.Any])
      
      inline def setUseBorderBoxUndefined: Self = StObject.set(x, "useBorderBox", js.undefined)
      
      inline def setUseColorSchemeMediaQuery(value: Boolean): Self = StObject.set(x, "useColorSchemeMediaQuery", value.asInstanceOf[js.Any])
      
      inline def setUseColorSchemeMediaQueryUndefined: Self = StObject.set(x, "useColorSchemeMediaQuery", js.undefined)
      
      inline def setUseCustomProperties(value: Boolean): Self = StObject.set(x, "useCustomProperties", value.asInstanceOf[js.Any])
      
      inline def setUseCustomPropertiesUndefined: Self = StObject.set(x, "useCustomProperties", js.undefined)
      
      inline def setUseLocalStorage(value: Boolean): Self = StObject.set(x, "useLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setUseLocalStorageUndefined: Self = StObject.set(x, "useLocalStorage", js.undefined)
      
      inline def setZIndices(
        value: Scale[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any
            ]
      ): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
      
      inline def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
      
      inline def setZIndicesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any)*
      ): Self = StObject.set(x, "zIndices", js.Array(value :_*))
    }
  }
  
  /* augmented module */
  object emotionReactAugmentingMod {
    
    type Theme = ThemeUITheme
  }
}
