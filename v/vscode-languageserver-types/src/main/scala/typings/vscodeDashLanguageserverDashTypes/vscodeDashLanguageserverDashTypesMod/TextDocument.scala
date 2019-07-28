package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocument extends js.Object {
  /**
    * The identifier of the language associated with this document.
    *
    * @readonly
    */
  val languageId: String = js.native
  /**
    * The number of lines in this document.
    *
    * @readonly
    */
  val lineCount: Double = js.native
  /**
    * The associated URI for this document. Most documents have the __file__-scheme, indicating that they
    * represent files on disk. However, some documents may have other schemes indicating that they are not
    * available on disk.
    *
    * @readonly
    */
  val uri: String = js.native
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    *
    * @readonly
    */
  val version: Double = js.native
  /**
    * Get the text of this document. A substring can be retrieved by
    * providing a range.
    *
    * @param range (optional) An range within the document to return.
    * If no range is passed, the full content is returned.
    * Invalid range positions are adjusted as described in [Position.line](#Position.line)
    * and [Position.character](#Position.character).
    * If the start range position is greater than the end range position,
    * then the effect of getText is as if the two positions were swapped.
    * @return The text of this document or a substring of the text if a
    *         range is provided.
    */
  def getText(): String = js.native
  def getText(range: Range): String = js.native
  /**
    * Converts the position to a zero-based offset.
    * Invalid positions are adjusted as described in [Position.line](#Position.line)
    * and [Position.character](#Position.character).
    *
    * @param position A position.
    * @return A valid zero-based offset.
    */
  def offsetAt(position: Position): Double = js.native
  /**
    * Converts a zero-based offset to a position.
    *
    * @param offset A zero-based offset.
    * @return A valid [position](#Position).
    */
  def positionAt(offset: Double): Position = js.native
}

