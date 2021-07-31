package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriterState_ extends StObject
/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState_ extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState_ & Double] = js.native
  
  /**
    * Writer is at a closing tag, e.g. `</node>`
    */
  @js.native
  sealed trait CloseTag
    extends StObject
       with WriterState_
  /* 3 */ val CloseTag: typings.xmlbuilder.mod.WriterState_.CloseTag & Double = js.native
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag
    extends StObject
       with WriterState_
  /* 2 */ val InsideTag: typings.xmlbuilder.mod.WriterState_.InsideTag & Double = js.native
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None
    extends StObject
       with WriterState_
  /* 0 */ val None: typings.xmlbuilder.mod.WriterState_.None & Double = js.native
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
  @js.native
  sealed trait OpenTag
    extends StObject
       with WriterState_
  /* 1 */ val OpenTag: typings.xmlbuilder.mod.WriterState_.OpenTag & Double = js.native
}
