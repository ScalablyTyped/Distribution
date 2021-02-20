package typings.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object specBaseMod {
  
  @scala.inline
  def DEFAULT_SPACING: /* 20 */ scala.Double = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SPACING").asInstanceOf[/* 20 */ scala.Double]
  
  type GenericCompositionLayoutWithColumns = typings.vegaLite.specBaseMod.GenericCompositionLayout with typings.vegaLite.specBaseMod.ColumnMixins
  
  @scala.inline
  def extractCompositionLayout_concat(
    spec: typings.vegaLite.specMod.NormalizedSpec,
    specType: typings.vegaLite.vegaLiteStrings.concat,
    config: typings.vegaLite.specBaseMod.CompositionConfigMixins
  ): typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns = (typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractCompositionLayout")(spec.asInstanceOf[js.Any], specType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns]
  
  @scala.inline
  def extractCompositionLayout_facet(
    spec: typings.vegaLite.specMod.NormalizedSpec,
    specType: typings.vegaLite.vegaLiteStrings.facet,
    config: typings.vegaLite.specBaseMod.CompositionConfigMixins
  ): typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns = (typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractCompositionLayout")(spec.asInstanceOf[js.Any], specType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns]
  
  @scala.inline
  def isFrameMixins(o: js.Any): /* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ scala.Boolean = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFrameMixins")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ scala.Boolean]
  
  @scala.inline
  def isStep(size: scala.Double): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  @scala.inline
  def isStep(size: typings.vegaLite.specBaseMod.Step): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  
  @scala.inline
  def isStep_container(size: typings.vegaLite.vegaLiteStrings.container): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  
  @scala.inline
  def isStep_merged(size: typings.vegaLite.vegaLiteStrings.merged): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typings.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
}
