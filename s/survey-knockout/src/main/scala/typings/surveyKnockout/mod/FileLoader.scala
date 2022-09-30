package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FileLoader")
@js.native
open class FileLoader protected () extends StObject {
  def this(
    fileQuestion: QuestionFileModel,
    callback: js.Function2[/* status */ String, /* files */ Any, Unit]
  ) = this()
  
  def dispose(): Unit = js.native
  
  def load(files: Any): Unit = js.native
  
  var loaded: Any = js.native
}
