package typings.verovio

import org.scalablytyped.runtime.StringDictionary
import typings.verovio.anon.Notes
import typings.verovio.anon.RealTimeOffsetMilliseconds
import typings.verovio.availableOptionsMod.AvailableOptions
import typings.verovio.editorActionMod.EditorAction
import typings.verovio.verovioOptionsMod.VerovioOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("verovio", "module")
  @js.native
  val module: VerovioModule = js.native
  
  @JSImport("verovio", "toolkit")
  @js.native
  open class toolkit () extends StObject {
    def this(verovioModule: VerovioModule) = this()
    
    /**
      * Filter Humdrum data.
      *
      * @returns The Humdrum data as a string
      */
    def convertHumdrumToHumdrum(humdrumData: String): String = js.native
    
    /**
      * Convert Humdrum data to MIDI.
      *
      * @returns The MIDI file as a base64-encoded string
      */
    def convertHumdrumToMIDI(humdrumData: String): String = js.native
    
    /**
      * Convert MEI data into Humdrum data.
      *
      * @returns The Humdrum data as a string
      */
    def convertMEIToHumdrum(meiData: String): String = js.native
    
    /**
      * Edit the MEI data.
      *
      * @param editorAction The editor actions as a JSON object
      * @returns True if the edit action was successfully applied
      */
    def edit(editorAction: EditorAction): Boolean = js.native
    
    /**
      * Return the editor status.
      *
      * @returns The editor status as an object
      */
    def editInfo(): EditorAction = js.native
    
    /**
      * Return all available options grouped by category.
      *
      * For each option, returns the type, the default value, and the minimum and maximum value (when available)
      */
    def getAvailableOptions(): AvailableOptions = js.native
    
    /**
      * Return descriptive features as a JSON string.
      * The features are tailored for implementing incipit search
      *
      * @param options A JSON object with the feature extraction options
      *
      * @returns A JSON object with the requested features
      */
    def getDescriptiveFeatures(): DescriptiveFeatures = js.native
    def getDescriptiveFeatures(options: Any): DescriptiveFeatures = js.native
    
    /**
      * Return element attributes as a JSON object.
      *
      * The attributes returned include the ones not supported by Verovio
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns A JSON object with all attributes
      */
    def getElementAttr(xmlId: String): StringDictionary[String] = js.native
    
    /**
      * Returns array of IDs of elements being currently played.
      *
      * @param millisec The time in milliseconds
      * @returns A JSON object with the page and notes being played
      */
    def getElementsAtTime(millisec: Double): Notes = js.native
    
    /**
      * Returns a vector of ID strings of all elements (the notated and the expanded) for a given element.
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns A JSON object with all IDs
      */
    def getExpansionIdsForElement(xmlId: String): StringDictionary[String] = js.native
    
    /**
      * Get the humdrum buffer.
      *
      * @returns The humdrum buffer as a string
      */
    def getHumdrum(): String = js.native
    
    /**
      * Returns the log message of the last performed operation, for example after having called loadData.
      *
      * @returns The log content as a string
      */
    def getLog(): String = js.native
    
    /**
      * Returns the MEI data loaded in the toolkit. If a page number is provided (i.e. > 0), then
      * only that page is exported. In score-based MEI, then only the section element will be
      * output. Set options.scoreBased to true for standard score-based MEI and false for the
      * internal page-based MEI.
      *
      * @param options  JSON object with the output options
      * @returns the MEI as a string
      */
    def getMEI(): String = js.native
    def getMEI(options: GetMeiOptions): String = js.native
    
    /**
      * Return MIDI values of the element with the ID (xml:id)
      *
      * RenderToMIDI() must be called prior to using this method
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns A JSON object with the MIDI values
      */
    def getMIDIValuesForElement(xmlId: String): MIDIValues = js.native
    
    /**
      * Returns the ID string of the notated (the original) element.
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns A stringified JSON object with all IDs
      */
    def getNotatedIdForElement(xmlId: String): String = js.native
    
    /**
      * Return a dictionary of all the options.
      *
      * @param defaultValues True for getting the default values and false for the current values
      * @returns A stringified JSON object
      */
    def getOptions(): VerovioOptions = js.native
    def getOptions(defaultValues: Boolean): VerovioOptions = js.native
    
    /**
      * Return the number of pages in the loaded document.
      *
      * The number of pages depends on the page size and if encoded layout was taken into account or not.
      *
      * @returns The number of pages
      */
    def getPageCount(): Double = js.native
    
    /**
      * Return the page on which the element is the ID (xml:id) is rendered.
      *
      * This takes into account the current layout options.
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns the page number (1-based) where the element is (0 if not found)
      */
    def getPageWithElement(xmlId: String): Double = js.native
    
    /**
      * Return the time at which the element is the ID (xml:id) is played.
      *
      * RenderToMIDI() must be called prior to using this method.
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns The time in milliseconds
      */
    def getTimeForElement(xmlId: String): Double = js.native
    
    /**
      * Return a JSON object string with the following key values for a given note.
      *
      * Return scoreTimeOnset, scoreTimeOffset, scoreTimeTiedDuration, realTimeOnsetMilliseconds, realTimeOffsetMilliseconds, realTimeTiedDurationMilliseconds.
      *
      * @param xmlId the ID (xml:id) of the element being looked for
      * @returns A JSON object with the values
      */
    def getTimesForElement(xmlId: String): RealTimeOffsetMilliseconds = js.native
    
    /**
      * Return the version number.
      *
      * @returns the version number as a string
      */
    def getVersion(): String = js.native
    
    /**
      * Load a string data with the type previously specified in the options.
      *
      * By default, the methods try to auto-detect the type.
      *
      * @param meiData A string with the data (e.g., MEI data) to be loaded
      * @returns True if the data was successfully loaded
      */
    def loadData(meiData: String): Boolean = js.native
    
    /**
      * Load a MusicXML compressed file passed as base64 encoded string.
      *
      * @param zipDataBase64 A ZIP file as a base64 encoded string
      * @returns True if the data was successfully loaded
      */
    def loadZipDataBase64(zipDataBase64: String): Boolean = js.native
    
    /**
      * Load a MusicXML compressed file passed as a buffer of bytes.
      *
      * @param zipDataBuffer A ZIP file as a buffer of bytes
      * @returns True if the data was successfully loaded
      */
    def loadZipDataBuffer(zipDataBuffer: js.typedarray.ArrayBuffer): Boolean = js.native
    
    /**
      * Redo the layout of the loaded data.
      *
      * This can be called once the rendering option were changed, for example with a new page (sceen) height or a new zoom level.
      *
      * @param options JSON object with the action options;
      */
    def redoLayout(): Unit = js.native
    def redoLayout(options: RedoLayoutOptions): Unit = js.native
    
    /**
      * Redo the layout of the pitch postitions of the current drawing page.
      *
      * Only the note vertical positions are recalculated with this method. RedoLayout() needs to be called for a full recalculation.
      */
    def redoPagePitchPosLayout(): Unit = js.native
    
    /**
      * Loads and the data with the options passed as JSON object and renders the first page. This
      * methods is a shortcut for loadData and then renderPage and is appropriate for rendering small
      * data snippets. The data does stay in memory once loaded. Also, up to version 0.9.12, the JSON
      * object had to be stringified.
      *
      * @deprecated
      */
    def renderData(meiData: String, options: VerovioOptions): String = js.native
    
    /**
      * Render the document to MIDI.
      * @returns A MIDI file as a base64 encoded string
      */
    def renderToMIDI(): String = js.native
    
    /**
      * Render a document to Plaine and Easie.
      *
      * Only the top staff / layer is exported.
      * @returns The PAE as a string
      */
    def renderToPAE(): String = js.native
    
    /**
      * Renders a page for the data loaded in the toolkit and returns it in SVG. The page numbering
      * is 1-based.
      *
      * @param pageNumber The page to render (1-based), defaults to 1
      * @param xmlDeclaration True for including the xml declaration in the SVG output, defaults to false
      * @returns The SVG page as a string
      */
    def renderToSVG(): String = js.native
    def renderToSVG(pageNumber: Double): String = js.native
    def renderToSVG(pageNumber: Double, xmlDeclaration: Boolean): String = js.native
    def renderToSVG(pageNumber: Unit, xmlDeclaration: Boolean): String = js.native
    
    /**
      * Render a document to a timemap.
      *
      * @param options A JSON object with the timemap options
      * @returns The timemap
      */
    def renderToTimemap(): js.Array[TimeMapEntry] = js.native
    def renderToTimemap(options: TimeMapOptions): js.Array[TimeMapEntry] = js.native
    
    /**
      * Reset all options to default values.
      */
    def resetOptions(): Unit = js.native
    
    /**
      * Reset the @xml:id seed.
      *
      * Passing 0 will seed the xml:id generator with a random (time-based) seed value. This method will have no effect if the xml-id-checksum option is set.
      *
      * @param seed The seed value for generating the xml:id values (0 for a time-based random seed)
      */
    def resetXmlIdSeed(seed: Double): Unit = js.native
    
    /**
      * Set the value for a selection.
      *
      * The selection will be applied only when some data is loaded or the layout is redone.
      * The selection can be reset (cancelled) by passing an empty string or an empty JSON object.
      * A selection across multiple mdivs is not possible.
      *
      * @param selection The selection as a JSON object
      * @returns True if the selection was successfully parsed or reset
      */
    def select(selection: js.Object): Boolean = js.native
    
    /**
      * Set option values.
      *
      * The name of each option to be set is to be given as JSON key.
      *
      * @param options A JSON objects with the output options
      * @returns True if the options were successfully set
      */
    def setOptions(options: VerovioOptions): Boolean = js.native
  }
  
  trait DescriptiveFeatures extends StObject {
    
    var intervalsChromatic: js.Array[String]
    
    var intervalsDiatonic: js.Array[String]
    
    var intervalsIds: js.Array[String]
    
    var pitchesChromatic: js.Array[String]
    
    var pitchesDiatonic: js.Array[String]
    
    var pitchesIds: js.Array[String]
  }
  object DescriptiveFeatures {
    
    inline def apply(
      intervalsChromatic: js.Array[String],
      intervalsDiatonic: js.Array[String],
      intervalsIds: js.Array[String],
      pitchesChromatic: js.Array[String],
      pitchesDiatonic: js.Array[String],
      pitchesIds: js.Array[String]
    ): DescriptiveFeatures = {
      val __obj = js.Dynamic.literal(intervalsChromatic = intervalsChromatic.asInstanceOf[js.Any], intervalsDiatonic = intervalsDiatonic.asInstanceOf[js.Any], intervalsIds = intervalsIds.asInstanceOf[js.Any], pitchesChromatic = pitchesChromatic.asInstanceOf[js.Any], pitchesDiatonic = pitchesDiatonic.asInstanceOf[js.Any], pitchesIds = pitchesIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptiveFeatures]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescriptiveFeatures] (val x: Self) extends AnyVal {
      
      inline def setIntervalsChromatic(value: js.Array[String]): Self = StObject.set(x, "intervalsChromatic", value.asInstanceOf[js.Any])
      
      inline def setIntervalsChromaticVarargs(value: String*): Self = StObject.set(x, "intervalsChromatic", js.Array(value*))
      
      inline def setIntervalsDiatonic(value: js.Array[String]): Self = StObject.set(x, "intervalsDiatonic", value.asInstanceOf[js.Any])
      
      inline def setIntervalsDiatonicVarargs(value: String*): Self = StObject.set(x, "intervalsDiatonic", js.Array(value*))
      
      inline def setIntervalsIds(value: js.Array[String]): Self = StObject.set(x, "intervalsIds", value.asInstanceOf[js.Any])
      
      inline def setIntervalsIdsVarargs(value: String*): Self = StObject.set(x, "intervalsIds", js.Array(value*))
      
      inline def setPitchesChromatic(value: js.Array[String]): Self = StObject.set(x, "pitchesChromatic", value.asInstanceOf[js.Any])
      
      inline def setPitchesChromaticVarargs(value: String*): Self = StObject.set(x, "pitchesChromatic", js.Array(value*))
      
      inline def setPitchesDiatonic(value: js.Array[String]): Self = StObject.set(x, "pitchesDiatonic", value.asInstanceOf[js.Any])
      
      inline def setPitchesDiatonicVarargs(value: String*): Self = StObject.set(x, "pitchesDiatonic", js.Array(value*))
      
      inline def setPitchesIds(value: js.Array[String]): Self = StObject.set(x, "pitchesIds", value.asInstanceOf[js.Any])
      
      inline def setPitchesIdsVarargs(value: String*): Self = StObject.set(x, "pitchesIds", js.Array(value*))
    }
  }
  
  trait GetMeiOptions extends StObject {
    
    /**
      * Page number, 1-based. All pages if none (or 0) specified.
      */
    var pageNo: js.UndefOr[Double] = js.undefined
    
    /**
      * remove all @xml:id not used in the data; default false
      */
    var removeIds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default true
      */
    var scoreBased: js.UndefOr[Boolean] = js.undefined
  }
  object GetMeiOptions {
    
    inline def apply(): GetMeiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMeiOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetMeiOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNo(value: Double): Self = StObject.set(x, "pageNo", value.asInstanceOf[js.Any])
      
      inline def setPageNoUndefined: Self = StObject.set(x, "pageNo", js.undefined)
      
      inline def setRemoveIds(value: Boolean): Self = StObject.set(x, "removeIds", value.asInstanceOf[js.Any])
      
      inline def setRemoveIdsUndefined: Self = StObject.set(x, "removeIds", js.undefined)
      
      inline def setScoreBased(value: Boolean): Self = StObject.set(x, "scoreBased", value.asInstanceOf[js.Any])
      
      inline def setScoreBasedUndefined: Self = StObject.set(x, "scoreBased", js.undefined)
    }
  }
  
  trait MIDIValues extends StObject {
    
    var duration: Double
    
    var pitch: Double
    
    var time: Double
  }
  object MIDIValues {
    
    inline def apply(duration: Double, pitch: Double, time: Double): MIDIValues = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIDIValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MIDIValues] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedoLayoutOptions extends StObject {
    
    /**
      * true by default
      */
    var resetCache: js.UndefOr[Boolean] = js.undefined
  }
  object RedoLayoutOptions {
    
    inline def apply(): RedoLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedoLayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedoLayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
    }
  }
  
  trait TimeMapEntry extends StObject {
    
    var off: js.UndefOr[js.Array[String]] = js.undefined
    
    var on: js.UndefOr[js.Array[String]] = js.undefined
    
    var qstamp: Double
    
    var tempo: js.UndefOr[Double] = js.undefined
    
    var tstamp: Double
  }
  object TimeMapEntry {
    
    inline def apply(qstamp: Double, tstamp: Double): TimeMapEntry = {
      val __obj = js.Dynamic.literal(qstamp = qstamp.asInstanceOf[js.Any], tstamp = tstamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeMapEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeMapEntry] (val x: Self) extends AnyVal {
      
      inline def setOff(value: js.Array[String]): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOffVarargs(value: String*): Self = StObject.set(x, "off", js.Array(value*))
      
      inline def setOn(value: js.Array[String]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnVarargs(value: String*): Self = StObject.set(x, "on", js.Array(value*))
      
      inline def setQstamp(value: Double): Self = StObject.set(x, "qstamp", value.asInstanceOf[js.Any])
      
      inline def setTempo(value: Double): Self = StObject.set(x, "tempo", value.asInstanceOf[js.Any])
      
      inline def setTempoUndefined: Self = StObject.set(x, "tempo", js.undefined)
      
      inline def setTstamp(value: Double): Self = StObject.set(x, "tstamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeMapOptions extends StObject {
    
    var includeMeasures: js.UndefOr[Boolean] = js.undefined
    
    var includeRests: js.UndefOr[Boolean] = js.undefined
  }
  object TimeMapOptions {
    
    inline def apply(): TimeMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeMapOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludeMeasures(value: Boolean): Self = StObject.set(x, "includeMeasures", value.asInstanceOf[js.Any])
      
      inline def setIncludeMeasuresUndefined: Self = StObject.set(x, "includeMeasures", js.undefined)
      
      inline def setIncludeRests(value: Boolean): Self = StObject.set(x, "includeRests", value.asInstanceOf[js.Any])
      
      inline def setIncludeRestsUndefined: Self = StObject.set(x, "includeRests", js.undefined)
    }
  }
  
  trait VerovioModule extends StObject {
    
    def FS_createDataFile(parent: String, name: String, data: String, canRead: Boolean, canWrite: Boolean, canOwn: Boolean): Unit
    
    def FS_unlink(path: String): Unit
    
    def onRuntimeInitialized(): Unit
  }
  object VerovioModule {
    
    inline def apply(
      FS_createDataFile: (String, String, String, Boolean, Boolean, Boolean) => Unit,
      FS_unlink: String => Unit,
      onRuntimeInitialized: () => Unit
    ): VerovioModule = {
      val __obj = js.Dynamic.literal(FS_createDataFile = js.Any.fromFunction6(FS_createDataFile), FS_unlink = js.Any.fromFunction1(FS_unlink), onRuntimeInitialized = js.Any.fromFunction0(onRuntimeInitialized))
      __obj.asInstanceOf[VerovioModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerovioModule] (val x: Self) extends AnyVal {
      
      inline def setFS_createDataFile(value: (String, String, String, Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "FS_createDataFile", js.Any.fromFunction6(value))
      
      inline def setFS_unlink(value: String => Unit): Self = StObject.set(x, "FS_unlink", js.Any.fromFunction1(value))
      
      inline def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
    }
  }
}
