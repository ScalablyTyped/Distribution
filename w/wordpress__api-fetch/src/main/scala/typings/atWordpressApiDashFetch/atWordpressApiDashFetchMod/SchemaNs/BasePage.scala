package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>>>>, 'categories' | 'format' | 'sticky' | 'tags'> ]: @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>>>>[P]} */ trait BasePage[T /* <: Context */] extends js.Object {
  var menu_order: Double
  var parent: Double
}

object BasePage {
  @scala.inline
  def apply[T /* <: Context */](menu_order: Double, parent: Double): BasePage[T] = {
    val __obj = js.Dynamic.literal(menu_order = menu_order, parent = parent)
  
    __obj.asInstanceOf[BasePage[T]]
  }
}

