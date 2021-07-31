package typings.styledSystem.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantArgs[TStyle, K /* <: String */, TPropName] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[TPropName] = js.undefined
  
  /** theme key for variant definitions */
  var scale: js.UndefOr[String] = js.undefined
  
  /** inline theme aware variants definitions  */
  var variants: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: TStyle}
    */ typings.styledSystem.styledSystemStrings.VariantArgs & TopLevel[js.Any]
  ] = js.undefined
}
object VariantArgs {
  
  @scala.inline
  def apply[TStyle, K /* <: String */, TPropName](): VariantArgs[TStyle, K, TPropName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantArgs[TStyle, K, TPropName]]
  }
  
  @scala.inline
  implicit class VariantArgsMutableBuilder[Self <: VariantArgs[?, ?, ?], TStyle, K /* <: String */, TPropName] (val x: Self & (VariantArgs[TStyle, K, TPropName])) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setProp(value: TPropName): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setVariants(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in K ]: TStyle}
      */ typings.styledSystem.styledSystemStrings.VariantArgs & TopLevel[js.Any]
    ): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
