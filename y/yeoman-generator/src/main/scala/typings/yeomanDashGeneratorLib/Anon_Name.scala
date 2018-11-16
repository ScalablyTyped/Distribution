package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Name extends js.Object {
  /**
               * Retrieves user's email from Git in the global scope or the project scope
               * (it'll take what Git will use in the current context)
               * @return configured git email or undefined
               */
  def email(): java.lang.String
  /**
               * Retrieves user's name from Git in the global scope or the project scope
               * (it'll take what Git will use in the current context)
               * @return configured git name or undefined
               */
  def name(): java.lang.String
}

