package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EditImageCallback = js.Function1[/* $image */ typings.jquery.JQuery.Node, scala.Unit]

type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]

type htmlElement = java.lang.String

type popoverAirDef = js.Tuple5[
js.Tuple2[
  typings.summernote.summernoteStrings.color, 
  typings.summernote.mod.global.Summernote.popoverAirOptionsColor
], 
js.Tuple2[
  typings.summernote.summernoteStrings.font, 
  typings.summernote.mod.global.Summernote.popoverAirOptionsFont
], 
js.Tuple2[
  typings.summernote.summernoteStrings.para, 
  typings.summernote.mod.global.Summernote.popoverAirOptionsPara
], 
js.Tuple2[
  typings.summernote.summernoteStrings.table, 
  typings.summernote.mod.global.Summernote.popoverAirOptionsTable
], 
js.Tuple2[
  typings.summernote.summernoteStrings.insert, 
  typings.summernote.mod.global.Summernote.popoverAirOptionsInsert
]]

type popoverAirOptionsColor = typings.summernote.summernoteStrings.color

type popoverAirOptionsTable = typings.summernote.summernoteStrings.table

type popoverImageDef = js.Tuple3[
js.Tuple2[
  typings.summernote.summernoteStrings.imagesize, 
  js.Array[typings.summernote.mod.global.Summernote.popoverImageOptionsImagesize]
], 
js.Tuple2[
  typings.summernote.summernoteStrings.float, 
  js.Array[typings.summernote.mod.global.Summernote.popoverImageOptionsFloat]
], 
js.Tuple2[
  typings.summernote.summernoteStrings.remove, 
  js.Array[typings.summernote.mod.global.Summernote.popoverImageOptionsRemove]
]]

type popoverImageOptionsRemove = typings.summernote.summernoteStrings.removeMedia

type popoverLinkDef = js.Array[
js.Tuple2[
  typings.summernote.summernoteStrings.link, 
  js.Array[typings.summernote.mod.global.Summernote.popoverLinkLinkOptions]
]]

type toolbarColorGroupOptions = typings.summernote.summernoteStrings.color

// type toolbarDef = [string, string[]][]
type toolbarDef = js.Array[
js.Tuple2[
  typings.summernote.summernoteStrings.style | typings.summernote.summernoteStrings.font | typings.summernote.summernoteStrings.fontsize_ | typings.summernote.summernoteStrings.color | typings.summernote.summernoteStrings.para | typings.summernote.summernoteStrings.height | typings.summernote.summernoteStrings.table | typings.summernote.summernoteStrings.insert | typings.summernote.summernoteStrings.view | typings.summernote.summernoteStrings.help | typings.summernote.summernoteStrings.misc, 
  js.Array[
    typings.summernote.mod.global.Summernote.miscGroupOptions | typings.summernote.mod.global.Summernote.toolbarColorGroupOptions | typings.summernote.mod.global.Summernote.toolbarFontGroupOptions | typings.summernote.mod.global.Summernote.toolbarFontsizeGroupOptions | typings.summernote.mod.global.Summernote.toolbarHeightGroupOptions | typings.summernote.mod.global.Summernote.toolbarHelpGroupOptions | typings.summernote.mod.global.Summernote.toolbarInsertGroupOptions | typings.summernote.mod.global.Summernote.toolbarParaGroupOptions | typings.summernote.mod.global.Summernote.toolbarStyleGroupOptions | typings.summernote.mod.global.Summernote.toolbarTableGroupOptions | typings.summernote.mod.global.Summernote.toolbarViewGroupOptions
  ]
]]

type toolbarHeightGroupOptions = typings.summernote.summernoteStrings.height

type toolbarHelpGroupOptions = typings.summernote.summernoteStrings.help

type toolbarTableGroupOptions = typings.summernote.summernoteStrings.table
