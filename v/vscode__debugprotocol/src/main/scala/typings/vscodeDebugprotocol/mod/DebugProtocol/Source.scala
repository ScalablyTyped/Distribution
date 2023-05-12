package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.deemphasize
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.emphasize
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A `Source` is a descriptor for source code.
		It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
	*/
trait Source extends StObject {
  
  /** Additional data that a debug adapter might want to loop through the client.
  			The client should leave the data intact and persist it across sessions. The client should not interpret the data.
  		*/
  var adapterData: js.UndefOr[Any] = js.undefined
  
  /** The checksums associated with this file. */
  var checksums: js.UndefOr[js.Array[Checksum]] = js.undefined
  
  /** The short name of the source. Every source returned from the debug adapter has a name.
  			When sending a source to the debug adapter this name is optional.
  		*/
  var name: js.UndefOr[String] = js.undefined
  
  /** The origin of this source. For example, 'internal module', 'inlined content from source map', etc. */
  var origin: js.UndefOr[String] = js.undefined
  
  /** The path of the source to be shown in the UI.
  			It is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).
  		*/
  var path: js.UndefOr[String] = js.undefined
  
  /** A hint for how to present the source in the UI.
  			A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
  		*/
  var presentationHint: js.UndefOr[normal | emphasize | deemphasize] = js.undefined
  
  /** If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).
  			Since a `sourceReference` is only valid for a session, it can not be used to persist a source.
  			The value should be less than or equal to 2147483647 (2^31-1).
  		*/
  var sourceReference: js.UndefOr[Double] = js.undefined
  
  /** A list of sources that are related to this source. These may be the source that generated this source. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setAdapterData(value: Any): Self = StObject.set(x, "adapterData", value.asInstanceOf[js.Any])
    
    inline def setAdapterDataUndefined: Self = StObject.set(x, "adapterData", js.undefined)
    
    inline def setChecksums(value: js.Array[Checksum]): Self = StObject.set(x, "checksums", value.asInstanceOf[js.Any])
    
    inline def setChecksumsUndefined: Self = StObject.set(x, "checksums", js.undefined)
    
    inline def setChecksumsVarargs(value: Checksum*): Self = StObject.set(x, "checksums", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPresentationHint(value: normal | emphasize | deemphasize): Self = StObject.set(x, "presentationHint", value.asInstanceOf[js.Any])
    
    inline def setPresentationHintUndefined: Self = StObject.set(x, "presentationHint", js.undefined)
    
    inline def setSourceReference(value: Double): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
