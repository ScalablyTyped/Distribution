package typings.styledComponents.styledComponentsMod

import typings.react.mod.WeakValidationMap
import typings.std.Partial
import typings.styledComponents.styledComponentsStrings.defaultProps
import typings.styledComponents.styledComponentsStrings.propTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
trait ForwardRefExoticBase[P] extends StObject {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
  
  var defaultProps: js.UndefOr[Partial[typings.styledComponents.styledComponentsStrings.defaultProps]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var propTypes: js.UndefOr[WeakValidationMap[typings.styledComponents.styledComponentsStrings.propTypes]] = js.undefined
}
object ForwardRefExoticBase {
  
  inline def apply[P](DollarDollartypeof: js.Symbol): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
  
  extension [Self <: ForwardRefExoticBase[?], P](x: Self & ForwardRefExoticBase[P]) {
    
    inline def setDefaultProps(value: Partial[defaultProps]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDollarDollartypeof(value: js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setPropTypes(value: WeakValidationMap[propTypes]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
  }
}
