package typings.uuidParse

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String): Buffer = js.native
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String, buffer: js.Array[_]): Buffer = js.native
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String, buffer: js.Array[_], offset: Double): Buffer = js.native
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String, buffer: Buffer): Buffer = js.native
  @JSImport("uuid-parse", "parse")
  @js.native
  def parse(id: String, buffer: Buffer, offset: Double): Buffer = js.native
  
  @JSImport("uuid-parse", "unparse")
  @js.native
  def unparse(buffer: Buffer): String = js.native
  @JSImport("uuid-parse", "unparse")
  @js.native
  def unparse(buffer: Buffer, offset: Double): String = js.native
}
