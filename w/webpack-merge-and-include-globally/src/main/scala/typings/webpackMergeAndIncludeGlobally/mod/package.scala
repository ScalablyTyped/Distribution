package typings.webpackMergeAndIncludeGlobally

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Object that maps file names to array of all files (can also be defined by wildcard path) that will be merged together and saved under each file name.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-object}
    */
  type FilesMap = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  /**
    * Webpack plugin to merge your source files together into single file, to be included in index.html,
    * and achieving same effect as you would by including them all separately through <script> or <link>.
    */
  type MergeIntoFile = typings.std.Plugin
  
  /**
    * Alternative way to specify files as array of src & dest,
    * for flexibility to transform and create multiple destination files for same source when you need to generate additional map file for example.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-array}
    */
  type SourceDestinationMaps = js.Array[typings.webpackMergeAndIncludeGlobally.anon.Dest]
}
