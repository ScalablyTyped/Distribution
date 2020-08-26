package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addnew extends js.Object {
  var add_new: String = js.native
  var add_new_item: String = js.native
  var all_items: String = js.native
  var archives: String = js.native
  var attributes: String = js.native
  var edit_item: String = js.native
  var featured_image: String = js.native
  var filter_items_list: String = js.native
  var insert_into_item: String = js.native
  var item_published: String = js.native
  var item_published_privately: String = js.native
  var item_reverted_to_draft: String = js.native
  var item_scheduled: String = js.native
  var item_updated: String = js.native
  var items_list: String = js.native
  var items_list_navigation: String = js.native
  var menu_name: String = js.native
  var name: String = js.native
  var name_admin_bar: String = js.native
  var new_item: String = js.native
  var not_found: String = js.native
  var not_found_in_trash: String = js.native
  var parent_item_colon: String = js.native
  var remove_featured_image: String = js.native
  var search_items: String = js.native
  var set_featured_image: String = js.native
  var singular_name: String = js.native
  var uploaded_to_this_item: String = js.native
  var use_featured_image: String = js.native
  var view_item: String = js.native
  var view_items: String = js.native
}

object Addnew {
  @scala.inline
  def apply(
    add_new: String,
    add_new_item: String,
    all_items: String,
    archives: String,
    attributes: String,
    edit_item: String,
    featured_image: String,
    filter_items_list: String,
    insert_into_item: String,
    item_published: String,
    item_published_privately: String,
    item_reverted_to_draft: String,
    item_scheduled: String,
    item_updated: String,
    items_list: String,
    items_list_navigation: String,
    menu_name: String,
    name: String,
    name_admin_bar: String,
    new_item: String,
    not_found: String,
    not_found_in_trash: String,
    parent_item_colon: String,
    remove_featured_image: String,
    search_items: String,
    set_featured_image: String,
    singular_name: String,
    uploaded_to_this_item: String,
    use_featured_image: String,
    view_item: String,
    view_items: String
  ): Addnew = {
    val __obj = js.Dynamic.literal(add_new = add_new.asInstanceOf[js.Any], add_new_item = add_new_item.asInstanceOf[js.Any], all_items = all_items.asInstanceOf[js.Any], archives = archives.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], edit_item = edit_item.asInstanceOf[js.Any], featured_image = featured_image.asInstanceOf[js.Any], filter_items_list = filter_items_list.asInstanceOf[js.Any], insert_into_item = insert_into_item.asInstanceOf[js.Any], item_published = item_published.asInstanceOf[js.Any], item_published_privately = item_published_privately.asInstanceOf[js.Any], item_reverted_to_draft = item_reverted_to_draft.asInstanceOf[js.Any], item_scheduled = item_scheduled.asInstanceOf[js.Any], item_updated = item_updated.asInstanceOf[js.Any], items_list = items_list.asInstanceOf[js.Any], items_list_navigation = items_list_navigation.asInstanceOf[js.Any], menu_name = menu_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_admin_bar = name_admin_bar.asInstanceOf[js.Any], new_item = new_item.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], not_found_in_trash = not_found_in_trash.asInstanceOf[js.Any], parent_item_colon = parent_item_colon.asInstanceOf[js.Any], remove_featured_image = remove_featured_image.asInstanceOf[js.Any], search_items = search_items.asInstanceOf[js.Any], set_featured_image = set_featured_image.asInstanceOf[js.Any], singular_name = singular_name.asInstanceOf[js.Any], uploaded_to_this_item = uploaded_to_this_item.asInstanceOf[js.Any], use_featured_image = use_featured_image.asInstanceOf[js.Any], view_item = view_item.asInstanceOf[js.Any], view_items = view_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addnew]
  }
  @scala.inline
  implicit class AddnewOps[Self <: Addnew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd_new(value: String): Self = this.set("add_new", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdd_new_item(value: String): Self = this.set("add_new_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setAll_items(value: String): Self = this.set("all_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchives(value: String): Self = this.set("archives", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: String): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit_item(value: String): Self = this.set("edit_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatured_image(value: String): Self = this.set("featured_image", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter_items_list(value: String): Self = this.set("filter_items_list", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert_into_item(value: String): Self = this.set("insert_into_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_published(value: String): Self = this.set("item_published", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_published_privately(value: String): Self = this.set("item_published_privately", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_reverted_to_draft(value: String): Self = this.set("item_reverted_to_draft", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_scheduled(value: String): Self = this.set("item_scheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_updated(value: String): Self = this.set("item_updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems_list(value: String): Self = this.set("items_list", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems_list_navigation(value: String): Self = this.set("items_list_navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu_name(value: String): Self = this.set("menu_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName_admin_bar(value: String): Self = this.set("name_admin_bar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew_item(value: String): Self = this.set("new_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setNot_found(value: String): Self = this.set("not_found", value.asInstanceOf[js.Any])
    @scala.inline
    def setNot_found_in_trash(value: String): Self = this.set("not_found_in_trash", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent_item_colon(value: String): Self = this.set("parent_item_colon", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove_featured_image(value: String): Self = this.set("remove_featured_image", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch_items(value: String): Self = this.set("search_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet_featured_image(value: String): Self = this.set("set_featured_image", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular_name(value: String): Self = this.set("singular_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploaded_to_this_item(value: String): Self = this.set("uploaded_to_this_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_featured_image(value: String): Self = this.set("use_featured_image", value.asInstanceOf[js.Any])
    @scala.inline
    def setView_item(value: String): Self = this.set("view_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setView_items(value: String): Self = this.set("view_items", value.asInstanceOf[js.Any])
  }
  
}

