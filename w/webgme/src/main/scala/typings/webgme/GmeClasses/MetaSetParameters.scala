package typings.webgme.GmeClasses

import typings.webgme.anon.Members
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaSetParameters extends js.Object {
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[Boolean] = js.undefined
  /** the input parameters of the query. */
  var `object`: Members
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
}

object MetaSetParameters {
  @scala.inline
  def apply(
    `object`: Members,
    multiplicity: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): MetaSetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplicity)) __obj.updateDynamic("multiplicity")(multiplicity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSetParameters]
  }
}

