package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlLib {
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean
  type XmlDesc = _XmlDesc | js.Array[XmlAtom] | XmlAtom | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify XmlDescArray */ js.Any)
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ElementObject */ js.Any) | XmlDesc
  ]) | XmlDesc
}
