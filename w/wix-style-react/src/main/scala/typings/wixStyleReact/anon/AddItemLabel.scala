package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.Validator
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import typings.wixStyleReact.distTypesTableListItemMod.TableListItemColumn
import typings.wixStyleReact.distTypesTableListItemMod.TableListItemImperativeActions
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemLabel extends StObject {
  
  var actions: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]]
  
  var addItemLabel: Requireable[String]
  
  var checkbox: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var checkboxDisabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var dataHook: Validator[js.UndefOr[String | Null]]
  
  var dragDisabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var draggable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var dragging: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var focused: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var id: typings.propTypes.mod.Validator[String | Double]
  
  var isCollapsed: Requireable[Boolean]
  
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  
  var onBlur: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Unit]) | Null
      ]
    ]
  ] = js.undefined
  
  var onCheckboxChange: js.UndefOr[Validator[js.UndefOr[ChangeEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onClick: js.UndefOr[Validator[js.UndefOr[js.Function | Null]]] = js.undefined
  
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]] = js.undefined
  
  var options: js.UndefOr[Validator[js.Array[TableListItemColumn]]] = js.undefined
  
  var ref: js.UndefOr[Validator[js.UndefOr[Ref[TableListItemImperativeActions]]]] = js.undefined
  
  var showDivider: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var verticalPadding: js.UndefOr[Validator[js.UndefOr[small | medium | tiny | Null]]] = js.undefined
}
object AddItemLabel {
  
  inline def apply(
    actions: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]],
    addItemLabel: Requireable[String],
    dataHook: Validator[js.UndefOr[String | Null]],
    id: typings.propTypes.mod.Validator[String | Double],
    isCollapsed: Requireable[Boolean]
  ): AddItemLabel = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], addItemLabel = addItemLabel.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemLabel]
  }
  
  extension [Self <: AddItemLabel](x: Self) {
    
    inline def setActions(value: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setAddItemLabel(value: Requireable[String]): Self = StObject.set(x, "addItemLabel", value.asInstanceOf[js.Any])
    
    inline def setCheckbox(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "checkboxDisabled", value.asInstanceOf[js.Any])
    
    inline def setCheckboxDisabledUndefined: Self = StObject.set(x, "checkboxDisabled", js.undefined)
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDragDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "dragDisabled", value.asInstanceOf[js.Any])
    
    inline def setDragDisabledUndefined: Self = StObject.set(x, "dragDisabled", js.undefined)
    
    inline def setDraggable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDragging(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    inline def setFocused(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setId(value: typings.propTypes.mod.Validator[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsCollapsed(value: Requireable[Boolean]): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnBlur(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Unit]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCheckboxChange(value: Validator[js.UndefOr[ChangeEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCheckboxChange", value.asInstanceOf[js.Any])
    
    inline def setOnCheckboxChangeUndefined: Self = StObject.set(x, "onCheckboxChange", js.undefined)
    
    inline def setOnClick(value: Validator[js.UndefOr[js.Function | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnKeyUp(value: Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOptions(value: Validator[js.Array[TableListItemColumn]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRef(value: Validator[js.UndefOr[Ref[TableListItemImperativeActions]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setShowDivider(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
    
    inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
    
    inline def setVerticalPadding(value: Validator[js.UndefOr[small | medium | tiny | Null]]): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    
    inline def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
  }
}
