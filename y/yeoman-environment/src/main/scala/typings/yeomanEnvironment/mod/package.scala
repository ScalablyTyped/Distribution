package typings.yeomanEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Represents an adapter.
    */
  type Adapter = typings.yeomanEnvironment.adapterMod.^
  
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
  js.Function1[/* err */ typings.std.Error | scala.Null, scala.Unit]
  
  /**
    * Represents a question.
    */
  type Question[T] = typings.inquirer.mod.DistinctQuestion[T]
  
  /**
    * Represents a collection of questions.
    */
  type Questions[T] = typings.inquirer.mod.QuestionCollection[T]
}
