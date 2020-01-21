package typings.summernote.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Summernote {
  type EditImageCallback = js.Function1[/* $image */ typings.jquery.JQuery_.Node, scala.Unit]
  type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]
  type htmlElement = java.lang.String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[
      typings.summernote.summernoteStrings.color, 
      typings.summernote.mod._Global_.Summernote.popoverAirOptionsColor
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.font, 
      typings.summernote.mod._Global_.Summernote.popoverAirOptionsFont
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.para, 
      typings.summernote.mod._Global_.Summernote.popoverAirOptionsPara
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.table, 
      typings.summernote.mod._Global_.Summernote.popoverAirOptionsTable
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.insert, 
      typings.summernote.mod._Global_.Summernote.popoverAirOptionsInsert
    ]
  ]
  type popoverAirOptionsColor = typings.summernote.summernoteStrings.color
  type popoverAirOptionsTable = typings.summernote.summernoteStrings.table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[
      typings.summernote.summernoteStrings.imagesize, 
      js.Array[typings.summernote.mod._Global_.Summernote.popoverImageOptionsImagesize]
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.float, 
      js.Array[typings.summernote.mod._Global_.Summernote.popoverImageOptionsFloat]
    ], 
    js.Tuple2[
      typings.summernote.summernoteStrings.remove, 
      js.Array[typings.summernote.mod._Global_.Summernote.popoverImageOptionsRemove]
    ]
  ]
  type popoverImageOptionsRemove = typings.summernote.summernoteStrings.removeMedia
  type popoverLinkDef = js.Array[
    js.Tuple2[
      typings.summernote.summernoteStrings.link, 
      js.Array[typings.summernote.mod._Global_.Summernote.popoverLinkLinkOptions]
    ]
  ]
  type toolbarColorGroupOptions = typings.summernote.summernoteStrings.color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      typings.summernote.summernoteStrings.style | typings.summernote.summernoteStrings.font | typings.summernote.summernoteStrings.fontsize_ | typings.summernote.summernoteStrings.color | typings.summernote.summernoteStrings.para | typings.summernote.summernoteStrings.height | typings.summernote.summernoteStrings.table | typings.summernote.summernoteStrings.insert | typings.summernote.summernoteStrings.view | typings.summernote.summernoteStrings.help | typings.summernote.summernoteStrings.misc, 
      js.Array[
        typings.summernote.mod._Global_.Summernote.miscGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarColorGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarFontGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarFontsizeGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarHeightGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarHelpGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarInsertGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarParaGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarStyleGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarTableGroupOptions | typings.summernote.mod._Global_.Summernote.toolbarViewGroupOptions
      ]
    ]
  ]
  type toolbarHeightGroupOptions = typings.summernote.summernoteStrings.height
  type toolbarHelpGroupOptions = typings.summernote.summernoteStrings.help
  type toolbarTableGroupOptions = typings.summernote.summernoteStrings.table
}
