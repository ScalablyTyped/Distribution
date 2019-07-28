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
    val __obj = js.Dynamic.literal(add_new_item = add_new_item, all_items = all_items, back_to_items = back_to_items, edit_item = edit_item, items_list = items_list, items_list_navigation = items_list_navigation, menu_name = menu_name, most_used = most_used, name = name, name_admin_bar = name_admin_bar, new_item_name = new_item_name, no_terms = no_terms, not_found = not_found, search_items = search_items, singular_name = singular_name, update_item = update_item, view_item = view_item)
    if (add_or_remove_items != null) __obj.updateDynamic("add_or_remove_items")(add_or_remove_items)
    if (choose_from_most_used != null) __obj.updateDynamic("choose_from_most_used")(choose_from_most_used)
    if (parent_item != null) __obj.updateDynamic("parent_item")(parent_item)
    if (parent_item_colon != null) __obj.updateDynamic("parent_item_colon")(parent_item_colon)
    if (popular_items != null) __obj.updateDynamic("popular_items")(popular_items)
    if (separate_items_with_commas != null) __obj.updateDynamic("separate_items_with_commas")(separate_items_with_commas)
    __obj.asInstanceOf[Anon_Addnewitem]
  }
}

