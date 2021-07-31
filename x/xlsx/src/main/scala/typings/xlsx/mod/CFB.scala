package typings.xlsx.mod

import typings.cfb.mod.CFBBlob
import typings.cfb.mod.CFBContainer
import typings.cfb.mod.CFBEntry
import typings.cfb.mod.CFBParsingOptions
import typings.cfb.mod.CFBUtils
import typings.cfb.mod.CFBWritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CFB {
  
  @JSImport("xlsx", "CFB")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xlsx", "CFB.CFB$EntryType")
  @js.native
  object CFBEntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cfb.mod.CFBEntryType & Double] = js.native
    
    /* 3 */ val lockbytes: typings.cfb.mod.CFBEntryType.lockbytes & Double = js.native
    
    /* 4 */ val property: typings.cfb.mod.CFBEntryType.property & Double = js.native
    
    /* 5 */ val root: typings.cfb.mod.CFBEntryType.root & Double = js.native
    
    /* 1 */ val storage: typings.cfb.mod.CFBEntryType.storage & Double = js.native
    
    /* 2 */ val stream: typings.cfb.mod.CFBEntryType.stream & Double = js.native
    
    /* 0 */ val unknown: typings.cfb.mod.CFBEntryType.unknown & Double = js.native
  }
  
  @JSImport("xlsx", "CFB.CFB$StorageType")
  @js.native
  object CFBStorageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cfb.mod.CFBStorageType & Double] = js.native
    
    /* 0 */ val fat: typings.cfb.mod.CFBStorageType.fat & Double = js.native
    
    /* 1 */ val minifat: typings.cfb.mod.CFBStorageType.minifat & Double = js.native
  }
  
  @scala.inline
  def find(cfb: CFBContainer, path: String): CFBEntry | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(cfb.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CFBEntry | Null]
  
  @scala.inline
  def parse(f: CFBBlob): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def parse(f: CFBBlob, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  
  @scala.inline
  def read(f: String): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: String, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: CFBBlob): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: CFBBlob, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  
  @JSImport("xlsx", "CFB.utils")
  @js.native
  val utils: CFBUtils = js.native
  
  @JSImport("xlsx", "CFB.version")
  @js.native
  val version: String = js.native
  
  @scala.inline
  def write(cfb: CFBContainer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(cfb.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def write(cfb: CFBContainer, options: CFBWritingOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(cfb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def writeFile(cfb: CFBContainer, filename: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(cfb.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def writeFile(cfb: CFBContainer, filename: String, options: CFBWritingOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(cfb.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
