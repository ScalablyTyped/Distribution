package typings.summernote.summernoteMod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var airMode: js.UndefOr[Boolean] = js.undefined
  var callbacks: js.UndefOr[js.Any] = js.undefined
   // todo
  var codemirror: js.UndefOr[CodemirrorOptions] = js.undefined
  var colors: js.UndefOr[colorsDef] = js.undefined
  var dialogsFade: js.UndefOr[Boolean] = js.undefined
  var dialogsInBody: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var disableDragAndDrop: js.UndefOr[Boolean] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var fontNames: js.UndefOr[js.Array[String]] = js.undefined
  var fontNamesIgnoreCheck: js.UndefOr[js.Array[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hint: js.UndefOr[HintOptions] = js.undefined
  var icons: js.UndefOr[IconsOptions] = js.undefined
  var insertTableMaxSize: js.UndefOr[InsertTableMaxSizeOptions] = js.undefined
  var keyMap: js.UndefOr[KeyMapOptions] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lineHeights: js.UndefOr[js.Array[String]] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maximumImageFileSize: js.UndefOr[js.Any] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var modules: js.UndefOr[ModuleOptions] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popover: js.UndefOr[PopoverOptions] = js.undefined
  var shortcuts: js.UndefOr[Boolean] = js.undefined
  var styleTags: js.UndefOr[js.Array[styleTagsOptions]] = js.undefined
  var styleWithSpan: js.UndefOr[Boolean] = js.undefined
  var tableClassName: js.UndefOr[String] = js.undefined
  var tabsize: js.UndefOr[Double] = js.undefined
  var textareaAutoSync: js.UndefOr[Boolean] = js.undefined
  var toolbar: js.UndefOr[toolbarDef] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    airMode: js.UndefOr[Boolean] = js.undefined,
    callbacks: js.Any = null,
    codemirror: CodemirrorOptions = null,
    colors: colorsDef = null,
    dialogsFade: js.UndefOr[Boolean] = js.undefined,
    dialogsInBody: js.UndefOr[Boolean] = js.undefined,
    direction: String = null,
    disableDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    fontNames: js.Array[String] = null,
    fontNamesIgnoreCheck: js.Array[String] = null,
    height: Int | Double = null,
    hint: HintOptions = null,
    icons: IconsOptions = null,
    insertTableMaxSize: InsertTableMaxSizeOptions = null,
    keyMap: KeyMapOptions = null,
    lang: String = null,
    lineHeights: js.Array[String] = null,
    maxHeight: Int | Double = null,
    maximumImageFileSize: js.Any = null,
    minHeight: Int | Double = null,
    modules: ModuleOptions = null,
    placeholder: String = null,
    popover: PopoverOptions = null,
    shortcuts: js.UndefOr[Boolean] = js.undefined,
    styleTags: js.Array[styleTagsOptions] = null,
    styleWithSpan: js.UndefOr[Boolean] = js.undefined,
    tableClassName: String = null,
    tabsize: Int | Double = null,
    textareaAutoSync: js.UndefOr[Boolean] = js.undefined,
    toolbar: toolbarDef = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(airMode)) __obj.updateDynamic("airMode")(airMode)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (codemirror != null) __obj.updateDynamic("codemirror")(codemirror)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(dialogsFade)) __obj.updateDynamic("dialogsFade")(dialogsFade)
    if (!js.isUndefined(dialogsInBody)) __obj.updateDynamic("dialogsInBody")(dialogsInBody)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disableDragAndDrop)) __obj.updateDynamic("disableDragAndDrop")(disableDragAndDrop)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (fontNames != null) __obj.updateDynamic("fontNames")(fontNames)
    if (fontNamesIgnoreCheck != null) __obj.updateDynamic("fontNamesIgnoreCheck")(fontNamesIgnoreCheck)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (insertTableMaxSize != null) __obj.updateDynamic("insertTableMaxSize")(insertTableMaxSize)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maximumImageFileSize != null) __obj.updateDynamic("maximumImageFileSize")(maximumImageFileSize)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (!js.isUndefined(shortcuts)) __obj.updateDynamic("shortcuts")(shortcuts)
    if (styleTags != null) __obj.updateDynamic("styleTags")(styleTags)
    if (!js.isUndefined(styleWithSpan)) __obj.updateDynamic("styleWithSpan")(styleWithSpan)
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName)
    if (tabsize != null) __obj.updateDynamic("tabsize")(tabsize.asInstanceOf[js.Any])
    if (!js.isUndefined(textareaAutoSync)) __obj.updateDynamic("textareaAutoSync")(textareaAutoSync)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

