package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addnewitem extends js.Object {
  
  var add_new_item: String = js.native
  
  var add_or_remove_items: String | Null = js.native
  
  var all_items: String = js.native
  
  var back_to_items: String = js.native
  
  var choose_from_most_used: String | Null = js.native
  
  var edit_item: String = js.native
  
  var items_list: String = js.native
  
  var items_list_navigation: String = js.native
  
  var menu_name: String = js.native
  
  var most_used: String = js.native
  
  var name: String = js.native
  
  var name_admin_bar: String = js.native
  
  var new_item_name: String = js.native
  
  var no_terms: String = js.native
  
  var not_found: String = js.native
  
  var parent_item: String | Null = js.native
  
  var parent_item_colon: String | Null = js.native
  
  var popular_items: String | Null = js.native
  
  var search_items: String = js.native
  
  var separate_items_with_commas: String | Null = js.native
  
  var singular_name: String = js.native
  
  var update_item: String = js.native
  
  var view_item: String = js.native
}
object Addnewitem {
  
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
    view_item: String
  ): Addnewitem = {
    val __obj = js.Dynamic.literal(add_new_item = add_new_item.asInstanceOf[js.Any], all_items = all_items.asInstanceOf[js.Any], back_to_items = back_to_items.asInstanceOf[js.Any], edit_item = edit_item.asInstanceOf[js.Any], items_list = items_list.asInstanceOf[js.Any], items_list_navigation = items_list_navigation.asInstanceOf[js.Any], menu_name = menu_name.asInstanceOf[js.Any], most_used = most_used.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_admin_bar = name_admin_bar.asInstanceOf[js.Any], new_item_name = new_item_name.asInstanceOf[js.Any], no_terms = no_terms.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], search_items = search_items.asInstanceOf[js.Any], singular_name = singular_name.asInstanceOf[js.Any], update_item = update_item.asInstanceOf[js.Any], view_item = view_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addnewitem]
  }
  
  @scala.inline
  implicit class AddnewitemOps[Self <: Addnewitem] (val x: Self) extends AnyVal {
    
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
    def setAdd_new_item(value: String): Self = this.set("add_new_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_items(value: String): Self = this.set("all_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack_to_items(value: String): Self = this.set("back_to_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_item(value: String): Self = this.set("edit_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems_list(value: String): Self = this.set("items_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems_list_navigation(value: String): Self = this.set("items_list_navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu_name(value: String): Self = this.set("menu_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMost_used(value: String): Self = this.set("most_used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_admin_bar(value: String): Self = this.set("name_admin_bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_item_name(value: String): Self = this.set("new_item_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_terms(value: String): Self = this.set("no_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot_found(value: String): Self = this.set("not_found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_items(value: String): Self = this.set("search_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingular_name(value: String): Self = this.set("singular_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_item(value: String): Self = this.set("update_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_item(value: String): Self = this.set("view_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_or_remove_items(value: String): Self = this.set("add_or_remove_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_or_remove_itemsNull: Self = this.set("add_or_remove_items", null)
    
    @scala.inline
    def setChoose_from_most_used(value: String): Self = this.set("choose_from_most_used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoose_from_most_usedNull: Self = this.set("choose_from_most_used", null)
    
    @scala.inline
    def setParent_item(value: String): Self = this.set("parent_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_itemNull: Self = this.set("parent_item", null)
    
    @scala.inline
    def setParent_item_colon(value: String): Self = this.set("parent_item_colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_item_colonNull: Self = this.set("parent_item_colon", null)
    
    @scala.inline
    def setPopular_items(value: String): Self = this.set("popular_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopular_itemsNull: Self = this.set("popular_items", null)
    
    @scala.inline
    def setSeparate_items_with_commas(value: String): Self = this.set("separate_items_with_commas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparate_items_with_commasNull: Self = this.set("separate_items_with_commas", null)
  }
}
