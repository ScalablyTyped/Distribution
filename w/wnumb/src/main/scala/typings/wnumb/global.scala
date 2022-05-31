package typings.wnumb

import typings.wnumb.mod.Instance
import typings.wnumb.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Create a wNumb
    */
  inline def wNumb(): Instance = js.Dynamic.global.applyDynamic("wNumb")().asInstanceOf[Instance]
  inline def wNumb(options: Options): Instance = js.Dynamic.global.applyDynamic("wNumb")(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
}
