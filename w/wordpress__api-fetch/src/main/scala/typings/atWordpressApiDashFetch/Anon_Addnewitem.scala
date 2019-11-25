package typings.atWordpressApiDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addnewitem extends js.Object {
  var add_new_item: String
  var add_or_remove_items: String | Null
  var all_items: String
  var back_to_items: String
  var choose_from_most_used: String | Null
  var edit_item: String
  var items_list: String
  var items_list_navigation: String
  var menu_name: String
  var most_used: String
  var name: String
  var name_admin_bar: String
  var new_item_name: String
  var no_terms: String
  var not_found: String
  var parent_item: String | Null
  var parent_item_colon: String | Null
  var popular_items: String | Null
  var search_items: String
  var separate_items_with_commas: String | Null
  var singular_name: String
  var update_item: String
  var view_item: String
}

object Anon_Addnewitem {
  @scala.inline
  def apply(
    add_new_item: String,
    all_items: String,
    back_to_items: String,
    edit_item: String,
    items_list: String,
    items_list_navigation: String,
    menu_name: String,
    most_used: String,
    name: String,
    name_admin_bar: String,
    new_item_name: String,
    no_terms: String,
    not_found: String,
    search_items: String,
    singular_name: String,
    update_item: String,
    view_item: String,
    add_or_remove_items: String = null,
    choose_from_most_used: String = null,
    parent_item: String = null,
    parent_item_colon: String = null,
    popular_items: String = null,
    separate_items_with_commas: String = null
  ): Anon_Addnewitem = {
    val __obj = js.Dynamic.literal(add_new_item = add_new_item.asInstanceOf[js.Any], all_items = all_items.asInstanceOf[js.Any], back_to_items = back_to_items.asInstanceOf[js.Any], edit_item = edit_item.asInstanceOf[js.Any], items_list = items_list.asInstanceOf[js.Any], items_list_navigation = items_list_navigation.asInstanceOf[js.Any], menu_name = menu_name.asInstanceOf[js.Any], most_used = most_used.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_admin_bar = name_admin_bar.asInstanceOf[js.Any], new_item_name = new_item_name.asInstanceOf[js.Any], no_terms = no_terms.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], search_items = search_items.asInstanceOf[js.Any], singular_name = singular_name.asInstanceOf[js.Any], update_item = update_item.asInstanceOf[js.Any], view_item = view_item.asInstanceOf[js.Any])
    if (add_or_remove_items != null) __obj.updateDynamic("add_or_remove_items")(add_or_remove_items.asInstanceOf[js.Any])
    if (choose_from_most_used != null) __obj.updateDynamic("choose_from_most_used")(choose_from_most_used.asInstanceOf[js.Any])
    if (parent_item != null) __obj.updateDynamic("parent_item")(parent_item.asInstanceOf[js.Any])
    if (parent_item_colon != null) __obj.updateDynamic("parent_item_colon")(parent_item_colon.asInstanceOf[js.Any])
    if (popular_items != null) __obj.updateDynamic("popular_items")(popular_items.asInstanceOf[js.Any])
    if (separate_items_with_commas != null) __obj.updateDynamic("separate_items_with_commas")(separate_items_with_commas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Addnewitem]
  }
}

