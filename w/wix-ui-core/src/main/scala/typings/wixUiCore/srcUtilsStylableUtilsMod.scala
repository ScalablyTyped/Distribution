package typings.wixUiCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsStylableUtilsMod {
  
  @JSImport("wix-ui-core/src/utils/stylableUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachStylesToNode(node: HTMLElement, stylesObj: AttributeMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachStylesToNode")(node.asInstanceOf[js.Any], stylesObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detachStylesFromNode(node: HTMLElement, stylesObj: AttributeMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachStylesFromNode")(node.asInstanceOf[js.Any], stylesObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AttributeMap
    extends StObject
       with /* attributeName */ StringDictionary[js.UndefOr[StateValue]] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object AttributeMap {
    
    inline def apply(): AttributeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeMap]
    }
    
    extension [Self <: AttributeMap](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type StateValue = Boolean | Double | String
}
