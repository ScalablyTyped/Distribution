package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Location")
@js.native
open class Location protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _fileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var _length: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _start: Any = js.native
  
  /* CompleteClass */
  override def character(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def length(): Double = js.native
  
  /* CompleteClass */
  override def line(): Double = js.native
  
  /* CompleteClass */
  override def lineMap(): typings.typescriptServices.TypeScript.LineMap = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
object Location {
  
  @JSGlobal("TypeScript.Location")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def equals_(
    location1: typings.typescriptServices.TypeScript.Location,
    location2: typings.typescriptServices.TypeScript.Location
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(location1.asInstanceOf[js.Any], location2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
