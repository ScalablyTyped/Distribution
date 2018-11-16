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

