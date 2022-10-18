package typings.typedoc

import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibUtilsEventsMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSerializationEventsMod {
  
  @JSImport("typedoc/dist/lib/serialization/events", "SerializeEvent")
  @js.native
  open class SerializeEvent protected () extends Event {
    def this(name: String, project: ProjectReflection) = this()
    def this(
      name: String,
      project: ProjectReflection,
      output: typings.typedoc.distLibSerializationSchemaMod.ProjectReflection
    ) = this()
    
    var output: js.UndefOr[typings.typedoc.distLibSerializationSchemaMod.ProjectReflection] = js.native
    
    /**
      * The path of the directory the serialized JSON should be written to.
      */
    var outputDirectory: js.UndefOr[String] = js.native
    
    /**
      * The name of the main JSON file (base + ext)
      */
    var outputFile: js.UndefOr[String] = js.native
    
    /**
      * The project the renderer is currently processing.
      */
    val project: ProjectReflection = js.native
  }
  
  trait SerializeEventData extends StObject {
    
    var outputDirectory: js.UndefOr[String] = js.undefined
    
    var outputFile: js.UndefOr[String] = js.undefined
  }
  object SerializeEventData {
    
    inline def apply(): SerializeEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeEventData]
    }
    
    extension [Self <: SerializeEventData](x: Self) {
      
      inline def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      inline def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
    }
  }
}
