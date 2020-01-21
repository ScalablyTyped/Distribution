package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("user-agents", JSImport.Namespace)
@js.native
/**
  * The representation of a user-agents object.
  * @param object <Array, Function, Object, RegExp, or String> - A set of filters to apply to the generated user agents
  */
class ^ () extends UserAgent {
  def this(`object`: js.Any) = this()
  /**
    *  The value of data.appName
    */
  /* CompleteClass */
  override var appName: String = js.native
  /**
    * Get a fingerprint for the UserAgent instance
    */
  /* CompleteClass */
  override var data: Data = js.native
  /**
    * Generates a new UserAgent instance using the same filters that were used to construct userAgent
    */
  /* CompleteClass */
  override def random(): UserAgent = js.native
}

