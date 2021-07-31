package typings.validUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("valid-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isHttpUri(value: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHttpUri")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isHttpsUri(value: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHttpsUri")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isUri(value: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUri")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isWebUri(value: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebUri")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
