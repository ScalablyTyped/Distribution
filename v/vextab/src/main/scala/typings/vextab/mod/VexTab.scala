package typings.vextab.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "VexTab")
@js.native
open class VexTab protected () extends StObject {
  def this(artist: Artist) = this()
  
  def generate(): Unit = js.native
  
  def getArtist(): Artist = js.native
  
  def isValid(): Boolean = js.native
  
  def parse(code: String): js.Array[String] = js.native
  
  def parseABC(note: VexTabNote): Unit = js.native
  
  def parseChord(note: VexTabNote): Unit = js.native
  
  def parseCommand(note: VexTabNote): Unit = js.native
  
  def parseFret(note: VexTabNote): Unit = js.native
  
  def parseStaveElements(notes: js.Array[VexTabNote]): Unit = js.native
  
  def parseStaveOptions[T /* <: js.Object */](options: T): T = js.native
  
  def parseStaveText(text_line: js.Array[String]): Unit = js.native
  
  def reset(): Unit = js.native
}
