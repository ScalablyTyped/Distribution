package typings
package videoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias video.js.video.js.videojs.Child */ js.Object
    ]
  ] = js.undefined
  var name: java.lang.String
}

object Anon_Children {
  @scala.inline
  def apply(
    name: java.lang.String,
    children: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias video.js.video.js.videojs.Child */ js.Object
    ] = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_Children]
  }
}

