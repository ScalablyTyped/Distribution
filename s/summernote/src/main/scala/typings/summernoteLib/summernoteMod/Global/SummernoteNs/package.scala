package typings
package summernoteLib.summernoteMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SummernoteNs {
  type EditImageCallback = js.Function1[/* $image */ jqueryLib.JQueryNs.Node, scala.Unit]
  type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]
  type htmlElement = java.lang.String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[summernoteLib.summernoteLibStrings.color, popoverAirOptionsColor], 
    js.Tuple2[summernoteLib.summernoteLibStrings.font, popoverAirOptionsFont], 
    js.Tuple2[summernoteLib.summernoteLibStrings.para, popoverAirOptionsPara], 
    js.Tuple2[summernoteLib.summernoteLibStrings.table, popoverAirOptionsTable], 
    js.Tuple2[summernoteLib.summernoteLibStrings.insert, popoverAirOptionsInsert]
  ]
  type popoverAirOptionsColor = summernoteLib.summernoteLibStrings.color
  type popoverAirOptionsFont = summernoteLib.summernoteLibStrings.bold | summernoteLib.summernoteLibStrings.underline | summernoteLib.summernoteLibStrings.clear
  type popoverAirOptionsInsert = summernoteLib.summernoteLibStrings.link | summernoteLib.summernoteLibStrings.picture
  type popoverAirOptionsPara = summernoteLib.summernoteLibStrings.ul | summernoteLib.summernoteLibStrings.paragraph
  type popoverAirOptionsTable = summernoteLib.summernoteLibStrings.table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[
      summernoteLib.summernoteLibStrings.imagesize, 
      js.Array[popoverImageOptionsImagesize]
    ], 
    js.Tuple2[summernoteLib.summernoteLibStrings.float, js.Array[popoverImageOptionsFloat]], 
    js.Tuple2[summernoteLib.summernoteLibStrings.remove, js.Array[popoverImageOptionsRemove]]
  ]
  type popoverImageOptionsFloat = summernoteLib.summernoteLibStrings.floatLeft | summernoteLib.summernoteLibStrings.floatRight | summernoteLib.summernoteLibStrings.floatNone
  type popoverImageOptionsImagesize = summernoteLib.summernoteLibStrings.imageSize100 | summernoteLib.summernoteLibStrings.imageSize50 | summernoteLib.summernoteLibStrings.imageSize25
  type popoverImageOptionsRemove = summernoteLib.summernoteLibStrings.removeMedia
  type popoverLinkDef = js.Array[
    js.Tuple2[summernoteLib.summernoteLibStrings.link, js.Array[popoverLinkLinkOptions]]
  ]
  type popoverLinkLinkOptions = summernoteLib.summernoteLibStrings.linkDialogShow | summernoteLib.summernoteLibStrings.unlink
  type styleTagsOptions = summernoteLib.summernoteLibStrings.p | summernoteLib.summernoteLibStrings.blockquote | summernoteLib.summernoteLibStrings.pre | summernoteLib.summernoteLibStrings.h1 | summernoteLib.summernoteLibStrings.h2 | summernoteLib.summernoteLibStrings.h3 | summernoteLib.summernoteLibStrings.h4 | summernoteLib.summernoteLibStrings.h5 | summernoteLib.summernoteLibStrings.h6
  type toolbarColorGroupOptions = summernoteLib.summernoteLibStrings.color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    (js.Tuple2[summernoteLib.summernoteLibStrings.style, js.Array[toolbarStyleGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.font, js.Array[toolbarFontGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.fontsize, js.Array[toolbarFontsizeGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.color, js.Array[toolbarColorGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.para, js.Array[toolbarParaGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.height, js.Array[toolbarHeightGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.table, js.Array[toolbarTableGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.insert, js.Array[toolbarInsertGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.view, js.Array[toolbarViewGroupOptions]]) | (js.Tuple2[summernoteLib.summernoteLibStrings.help, js.Array[toolbarHelpGroupOptions]])
  ]
  type toolbarFontGroupOptions = summernoteLib.summernoteLibStrings.strikethrough | summernoteLib.summernoteLibStrings.superscript | summernoteLib.summernoteLibStrings.subscript
  type toolbarFontsizeGroupOptions = summernoteLib.summernoteLibStrings.fontsize
  type toolbarHeightGroupOptions = summernoteLib.summernoteLibStrings.height
  type toolbarHelpGroupOptions = summernoteLib.summernoteLibStrings.help
  type toolbarInsertGroupOptions = summernoteLib.summernoteLibStrings.link | summernoteLib.summernoteLibStrings.picture | summernoteLib.summernoteLibStrings.hr
  type toolbarParaGroupOptions = summernoteLib.summernoteLibStrings.ul | summernoteLib.summernoteLibStrings.ol | summernoteLib.summernoteLibStrings.paragraph
  type toolbarStyleGroupOptions = summernoteLib.summernoteLibStrings.style | summernoteLib.summernoteLibStrings.bold | summernoteLib.summernoteLibStrings.italic | summernoteLib.summernoteLibStrings.underline | summernoteLib.summernoteLibStrings.clear
  type toolbarTableGroupOptions = summernoteLib.summernoteLibStrings.table
  type toolbarViewGroupOptions = summernoteLib.summernoteLibStrings.fullscreen | summernoteLib.summernoteLibStrings.codeview
}
