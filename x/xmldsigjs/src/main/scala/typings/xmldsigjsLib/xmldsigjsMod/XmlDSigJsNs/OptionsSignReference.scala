package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSignReference extends js.Object {
  /**
    * Hash algorithm
    *
    * @type {AlgorithmIdentifier}
    * @memberOf OptionsSignReference
    */
  var hash: stdLib.AlgorithmIdentifier
  /**
    * Id of Reference
    *
    * @type {string}
    * @memberOf OptionsSignReference
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of transforms
    *
    * @type {OptionsSignTransform[]}
    * @memberOf OptionsSignReference
    */
  var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsSignReference {
  @scala.inline
  def apply(
    hash: stdLib.AlgorithmIdentifier,
    id: java.lang.String = null,
    transforms: js.Array[OptionsSignTransform] = null,
    `type`: java.lang.String = null,
    uri: java.lang.String = null
  ): OptionsSignReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[OptionsSignReference]
  }
}

