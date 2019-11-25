package typings.webgme.GmeClasses

import typings.webgme.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaNodeParameters extends js.Object {
  /**
    * if given, 
    * the query filters to contain only types 
    * that are visible in the given aspect.
    */
  var aspect: js.UndefOr[String] = js.undefined
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[Boolean] = js.undefined
  /** the input parameters of the query. */
  var `object`: Anon_Children
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
}

object MetaNodeParameters {
  @scala.inline
  def apply(
    `object`: Anon_Children,
    aspect: String = null,
    multiplicity: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): MetaNodeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplicity)) __obj.updateDynamic("multiplicity")(multiplicity.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaNodeParameters]
  }
}

