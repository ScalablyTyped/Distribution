package typings.urlParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(oldUrl: String, param: String, value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createUrlObject(oldUrl: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlObject")(oldUrl.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def remove(oldUrl: String, param: String, value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def set(oldUrl: String, param: String, value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
}
