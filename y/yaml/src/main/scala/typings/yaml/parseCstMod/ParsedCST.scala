package typings.yaml.parseCstMod

import typings.std.Array
import typings.yaml.parseCstMod.CST.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedCST
  extends StObject
     with Array[Document] {
  
  def setOrigRanges(): Boolean = js.native
}
