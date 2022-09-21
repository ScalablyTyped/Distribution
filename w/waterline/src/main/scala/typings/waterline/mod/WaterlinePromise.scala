package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterlinePromise[T]
  extends typings.bluebird.mod.^[T] {
  
  def exec(cb: js.Function2[/* err */ js.Error, /* result */ T, Any]): Unit = js.native
}
