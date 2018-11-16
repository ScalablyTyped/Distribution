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

