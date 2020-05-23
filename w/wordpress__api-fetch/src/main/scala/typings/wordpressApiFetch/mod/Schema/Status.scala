package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.mod.Schema.BaseStatus
  - typings.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded
  - typings.wordpressApiFetch.anon.PickBaseStatusStatus
*/
trait Status[T /* <: Context */] extends js.Object

object Status {
  @scala.inline
  def BaseStatus[T](
    _links: Record[String, js.Array[Dictk]],
    name: String,
    `private`: Boolean,
    `protected`: Boolean,
    public: Boolean,
    queryable: Boolean,
    show_in_list: Boolean,
    slug: String,
    _embedded: Record[String, js.Array[_]] = null
  ): Status[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], show_in_list = show_in_list.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status[T]]
  }
  @scala.inline
  def PickBaseStatusStatusEmbedded[T](
    _links: Record[String, js.Array[Dictk]],
    name: String,
    public: Boolean,
    queryable: Boolean,
    slug: String,
    _embedded: Record[String, js.Array[_]] = null
  ): Status[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status[T]]
  }
  @scala.inline
  def PickBaseStatusStatus[T](
    _links: Record[String, js.Array[Dictk]],
    name: String,
    slug: String,
    _embedded: Record[String, js.Array[_]] = null
  ): Status[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status[T]]
  }
}

