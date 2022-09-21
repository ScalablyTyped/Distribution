package typings.uid2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(length: Double): String = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(
    length: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("uid2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
