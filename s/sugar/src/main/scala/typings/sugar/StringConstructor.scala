package typings.sugar

import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs._NativeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringConstructor
  extends StObject
     with _NativeConstructor {
  
  def range(): Range = js.native
  def range(start: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: java.lang.String): Range = js.native
  def range(start: Unit, end: java.lang.String): Range = js.native
}
