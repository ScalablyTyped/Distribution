package typings.waterline.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterlinePromise[T]
  extends typings.bluebird.mod.^[T] {
  
  def exec(cb: js.Function2[/* err */ Error, /* result */ T, js.Any]): Unit = js.native
}
