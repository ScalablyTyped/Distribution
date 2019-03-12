package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def delete(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def follow(first_pattern: java.lang.String, rest_patterns: java.lang.String*): Builder
  def get(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def getResource(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def getUrl(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def json(): Builder
  def jsonHal(): Builder
  def newRequest(): Builder
  def patch(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def post(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def put(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def setMediaType(type_name: java.lang.String): Builder
  def withRequestOptions(options: js.Any): Builder
  def withTemplateParameters(parameters: js.Any): Builder
}

object Builder {
  @scala.inline
  def apply(
    delete: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ] => InAction,
    follow: (java.lang.String, /* repeated */ java.lang.String) => Builder,
    get: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ] => InAction,
    getResource: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ] => InAction,
    getUrl: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ] => InAction,
    json: () => Builder,
    jsonHal: () => Builder,
    newRequest: () => Builder,
    patch: (js.Any, js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]) => InAction,
    post: (js.Any, js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]) => InAction,
    put: (js.Any, js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]) => InAction,
    setMediaType: java.lang.String => Builder,
    withRequestOptions: js.Any => Builder,
    withTemplateParameters: js.Any => Builder
  ): Builder = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), follow = js.Any.fromFunction2(follow), get = js.Any.fromFunction1(get), getResource = js.Any.fromFunction1(getResource), getUrl = js.Any.fromFunction1(getUrl), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), newRequest = js.Any.fromFunction0(newRequest), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), put = js.Any.fromFunction2(put), setMediaType = js.Any.fromFunction1(setMediaType), withRequestOptions = js.Any.fromFunction1(withRequestOptions), withTemplateParameters = js.Any.fromFunction1(withTemplateParameters))
  
    __obj.asInstanceOf[Builder]
  }
}

