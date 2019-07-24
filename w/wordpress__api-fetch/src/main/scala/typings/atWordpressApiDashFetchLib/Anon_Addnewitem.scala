package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addnewitem extends js.Object {
  var add_new_item: java.lang.String
  var add_or_remove_items: java.lang.String | scala.Null
  var all_items: java.lang.String
  var back_to_items: java.lang.String
  var choose_from_most_used: java.lang.String | scala.Null
  var edit_item: java.lang.String
  var items_list: java.lang.String
  var items_list_navigation: java.lang.String
  var menu_name: java.lang.String
  var most_used: java.lang.String
  var name: java.lang.String
  var name_admin_bar: java.lang.String
  var new_item_name: java.lang.String
  var no_terms: java.lang.String
  var not_found: java.lang.String
  var parent_item: java.lang.String | scala.Null
  var parent_item_colon: java.lang.String | scala.Null
  var popular_items: java.lang.String | scala.Null
  var search_items: java.lang.String
  var separate_items_with_commas: java.lang.String | scala.Null
  var singular_name: java.lang.String
  var update_item: java.lang.String
  var view_item: java.lang.String
}

object Anon_Addnewitem {
  @scala.inline
  def apply(
    add_new_item: java.lang.String,
    all_items: java.lang.String,
    back_to_items: java.lang.String,
    edit_item: java.lang.String,
    items_list: java.lang.String,
    items_list_navigation: java.lang.String,
    menu_name: java.lang.String,
    most_used: java.lang.String,
    name: java.lang.String,
    name_admin_bar: java.lang.String,
    new_item_name: java.lang.String,
    no_terms: java.lang.String,
    not_found: java.lang.String,
    search_items: java.lang.String,
    singular_name: java.lang.String,
    update_item: java.lang.String,
    view_item: java.lang.String,
    add_or_remove_items: java.lang.String = null,
    choose_from_most_used: java.lang.String = null,
    parent_item: java.lang.String = null,
    parent_item_colon: java.lang.String = null,
    popular_items: java.lang.String = null,
    separate_items_with_commas: java.lang.String = null
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

