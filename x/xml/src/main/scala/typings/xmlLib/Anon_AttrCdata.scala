package typings
package xmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrCdata extends _XmlDesc {
  var _attr: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify XmlAttrs */ js.Any
  var _cdata: java.lang.String
}

object Anon_AttrCdata {
  @scala.inline
  def apply(
    _attr: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify XmlAttrs */ js.Any,
    _cdata: java.lang.String
  ): Anon_AttrCdata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_attr")(_attr)
    __obj.updateDynamic("_cdata")(_cdata)
    __obj.asInstanceOf[Anon_AttrCdata]
  }
}

