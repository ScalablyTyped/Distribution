package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Represents an answer-hash.
    */
  type Answers = typings.inquirer.mod.Answers
  
  /**
    * Provides the functionality to handle callbacks.
    */
  type Callback = /**
    * Handles a callback.
    *
    * @param err The error that occurred.
    */
  js.Function1[/* err */ js.Any, scala.Unit]
  
  /**
    * Represents a question.
    */
  type Question[T /* <: typings.yeomanGenerator.mod.Answers */] = typings.inquirer.mod.DistinctQuestion[T] with typings.yeomanGenerator.anon.Store
  
  /**
    * Provides options for registering a prompt.
    */
  type QuestionRegistrationOptions[T /* <: typings.yeomanGenerator.mod.Answers */] = typings.yeomanGenerator.mod.Question[T] with typings.yeomanGenerator.anon.ExportOption
  
  /**
    * Provides a set of questions.
    */
  type Questions[A /* <: typings.yeomanGenerator.mod.Answers */] = typings.yeomanGenerator.mod.Question[A] | js.Array[typings.yeomanGenerator.mod.Question[A]] | typings.rxjs.mod.Observable_[typings.yeomanGenerator.mod.Question[A]]
}
