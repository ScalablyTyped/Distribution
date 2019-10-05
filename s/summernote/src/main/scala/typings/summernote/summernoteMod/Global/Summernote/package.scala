package typings.summernote.summernoteMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Summernote {
  import typings.jquery.JQuery.Node
  import typings.summernote.summernoteStrings.color
  import typings.summernote.summernoteStrings.float
  import typings.summernote.summernoteStrings.font
  import typings.summernote.summernoteStrings.fontsize
  import typings.summernote.summernoteStrings.height
  import typings.summernote.summernoteStrings.help
  import typings.summernote.summernoteStrings.imagesize
  import typings.summernote.summernoteStrings.insert
  import typings.summernote.summernoteStrings.link
  import typings.summernote.summernoteStrings.para
  import typings.summernote.summernoteStrings.remove
  import typings.summernote.summernoteStrings.removeMedia
  import typings.summernote.summernoteStrings.style
  import typings.summernote.summernoteStrings.table
  import typings.summernote.summernoteStrings.view

  type EditImageCallback = js.Function1[/* $image */ Node, Unit]
  type colorsDef = js.Array[js.Array[js.Array[String]]]
  type htmlElement = String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[color, popoverAirOptionsColor], 
    js.Tuple2[font, popoverAirOptionsFont], 
    js.Tuple2[para, popoverAirOptionsPara], 
    js.Tuple2[table, popoverAirOptionsTable], 
    js.Tuple2[insert, popoverAirOptionsInsert]
  ]
  type popoverAirOptionsColor = color
  type popoverAirOptionsTable = table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[imagesize, js.Array[popoverImageOptionsImagesize]], 
    js.Tuple2[float, js.Array[popoverImageOptionsFloat]], 
    js.Tuple2[remove, js.Array[popoverImageOptionsRemove]]
  ]
  type popoverImageOptionsRemove = removeMedia
  type popoverLinkDef = js.Array[js.Tuple2[link, js.Array[popoverLinkLinkOptions]]]
  type toolbarColorGroupOptions = color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      style | font | fontsize | color | para | height | table | insert | view | help, 
      js.Array[
        toolbarColorGroupOptions | toolbarFontGroupOptions | toolbarFontsizeGroupOptions | toolbarHeightGroupOptions | toolbarHelpGroupOptions | toolbarInsertGroupOptions | toolbarParaGroupOptions | toolbarStyleGroupOptions | toolbarTableGroupOptions | toolbarViewGroupOptions
      ]
    ]
  ]
  type toolbarFontsizeGroupOptions = fontsize
  type toolbarHeightGroupOptions = height
  type toolbarHelpGroupOptions = help
  type toolbarTableGroupOptions = table
}
