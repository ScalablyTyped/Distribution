package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@TestsDataMatchPathDataMod` {
  
  @JSImport("tsconfig-paths/lib/@/tests/data/match-path-data", "tests")
  @js.native
  val tests: js.Array[OneTest] = js.native
  
  trait OneTest extends StObject {
    
    val absoluteBaseUrl: String
    
    val addMatchAll: js.UndefOr[Boolean] = js.undefined
    
    val existingFiles: js.Array[String]
    
    val expectedPath: js.UndefOr[String] = js.undefined
    
    val extensions: js.Array[String]
    
    val mainFields: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    val name: String
    
    val only: js.UndefOr[Boolean] = js.undefined
    
    val packageJson: js.UndefOr[js.Object] = js.undefined
    
    val paths: StringDictionary[js.Array[String]]
    
    val requestedModule: String
    
    val skip: js.UndefOr[Boolean] = js.undefined
  }
  object OneTest {
    
    inline def apply(
      absoluteBaseUrl: String,
      existingFiles: js.Array[String],
      extensions: js.Array[String],
      name: String,
      paths: StringDictionary[js.Array[String]],
      requestedModule: String
    ): OneTest = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], existingFiles = existingFiles.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], requestedModule = requestedModule.asInstanceOf[js.Any])
      __obj.asInstanceOf[OneTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OneTest] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteBaseUrl(value: String): Self = StObject.set(x, "absoluteBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      inline def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      inline def setExistingFiles(value: js.Array[String]): Self = StObject.set(x, "existingFiles", value.asInstanceOf[js.Any])
      
      inline def setExistingFilesVarargs(value: String*): Self = StObject.set(x, "existingFiles", js.Array(value*))
      
      inline def setExpectedPath(value: String): Self = StObject.set(x, "expectedPath", value.asInstanceOf[js.Any])
      
      inline def setExpectedPathUndefined: Self = StObject.set(x, "expectedPath", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setMainFields(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setPackageJson(value: js.Object): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonUndefined: Self = StObject.set(x, "packageJson", js.undefined)
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setRequestedModule(value: String): Self = StObject.set(x, "requestedModule", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
}
