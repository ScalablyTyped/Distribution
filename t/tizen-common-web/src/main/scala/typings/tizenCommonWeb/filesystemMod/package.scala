package typings.tizenCommonWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object filesystemMod {
  
  type FileArraySuccessCallback = js.Function1[/* files */ js.Array[typings.tizenCommonWeb.filesystemMod.File], scala.Unit]
  
  type FileStreamSuccessCallback = js.Function1[/* filestream */ typings.tizenCommonWeb.filesystemMod.FileStream, scala.Unit]
  
  type FileStringSuccessCallback = js.Function1[/* fileStr */ java.lang.String, scala.Unit]
  
  type FileSuccessCallback = js.Function1[/* file */ typings.tizenCommonWeb.filesystemMod.File, scala.Unit]
  
  type FileSystemStorageArraySuccessCallback = js.Function1[
    /* storages */ js.Array[typings.tizenCommonWeb.filesystemMod.FileSystemStorage], 
    scala.Unit
  ]
  
  type FileSystemStorageSuccessCallback = js.Function1[/* storage */ typings.tizenCommonWeb.filesystemMod.FileSystemStorage, scala.Unit]
  
  type ListDirectorySuccessCallback = js.Function2[
    /* names */ js.Array[java.lang.String], 
    /* path */ typings.tizenCommonWeb.filesystemMod.Path, 
    scala.Unit
  ]
  
  type Path = java.lang.String
  
  type PathSuccessCallback = js.Function1[/* path */ typings.tizenCommonWeb.filesystemMod.Path, scala.Unit]
  
  type ReadBlobSuccessCallback = js.Function1[/* blob */ typings.std.Blob, scala.Unit]
  
  type ReadDataSuccessCallback = js.Function1[/* data */ typings.std.Uint8Array, scala.Unit]
  
  type ReadStringSuccessCallback = js.Function1[/* string */ java.lang.String, scala.Unit]
  
  type SeekSuccessCallback = js.Function1[/* position */ scala.Double, scala.Unit]
  
  type WriteStringSuccessCallback = js.Function1[/* bytesCount */ scala.Double, scala.Unit]
}
