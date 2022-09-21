package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditChange extends StObject {
  
  def add(edit: AnnotatedTextEdit): Unit = js.native
  /**
    * Adds a text edit.
    *
    * @param edit the text edit to add.
    *
    * @since 3.16.0 - support for annotated text edits. This is usually
    * guarded using a client capability.
    */
  def add(edit: TextEdit): Unit = js.native
  
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    *
    * @since 3.16.0 - support for annotated text edits. This is usually
    * guarded using a client capability.
    */
  def all(): js.Array[TextEdit | AnnotatedTextEdit] = js.native
  
  /**
    * Clears the edits for this change.
    */
  def clear(): Unit = js.native
  
  def delete(range: Range): ChangeAnnotationIdentifier = js.native
  def delete(range: Range, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def delete(range: Range, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    * @param annotation An optional annotation.
    */
  @JSName("delete")
  def delete_Unit(range: Range): Unit = js.native
  
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    * @param annotation An optional annotation.
    */
  def insert(position: Position, newText: String): Unit = js.native
  def insert(position: Position, newText: String, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def insert(position: Position, newText: String, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  
  def replace(range: Range, newText: String): ChangeAnnotationIdentifier = js.native
  def replace(range: Range, newText: String, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def replace(range: Range, newText: String, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    * @param annotation An optional annotation.
    */
  @JSName("replace")
  def replace_Unit(range: Range, newText: String): Unit = js.native
}
