package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Media.SpeechRecognition.ISpeechRecognitionConstraint
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables speech recognition for command and control within Windows Runtime apps. */
object SpeechRecognition {
  
  /** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs")
  @js.native
  open class SpeechContinuousRecognitionCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs {
    
    /** Gets the result of a speech recognition session, or the result of a grammar constraint compilation. */
    /* CompleteClass */
    var status: SpeechRecognitionResultStatus = js.native
  }
  
  /** Specifies the behavior of the speech recognizer during a continuous recognition session. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode")
  @js.native
  object SpeechContinuousRecognitionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode.default & Double = js.native
    
    /* 1 */ val pauseOnRecognition: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode.pauseOnRecognition & Double = js.native
  }
  
  /** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs")
  @js.native
  open class SpeechContinuousRecognitionResultGeneratedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs {
    
    /** Gets the complete recognition result returned by the speech recognizer at the end of a dictation session ( SpeechRecognitionResultStatus is set to Success). */
    /* CompleteClass */
    var result: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult = js.native
  }
  
  /** Manages speech input for free-form dictation, or an arbitrary sequence of words or phrases that are defined in a grammar set. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession")
  @js.native
  open class SpeechContinuousRecognitionSession ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession
  
  /** Specifies the type of audio problem detected. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem")
  @js.native
  object SpeechRecognitionAudioProblem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem & Double
      ] = js.native
    
    /* 2 */ val noSignal: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.noSignal & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.none & Double = js.native
    
    /* 5 */ val tooFast: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooFast & Double = js.native
    
    /* 3 */ val tooLoud: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooLoud & Double = js.native
    
    /* 1 */ val tooNoisy: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooNoisy & Double = js.native
    
    /* 4 */ val tooQuiet: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooQuiet & Double = js.native
    
    /* 6 */ val tooSlow: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooSlow & Double = js.native
  }
  
  /** The result of compiling the constraints set for a SpeechRecognizer object. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult")
  @js.native
  open class SpeechRecognitionCompilationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult {
    
    /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
    /* CompleteClass */
    var status: SpeechRecognitionResultStatus = js.native
  }
  
  /** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
  @js.native
  object SpeechRecognitionConfidence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence & Double
      ] = js.native
    
    /* 0 */ val high: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.high & Double = js.native
    
    /* 2 */ val low: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.low & Double = js.native
    
    /* 1 */ val medium: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.medium & Double = js.native
    
    /* 3 */ val rejected: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.rejected & Double = js.native
  }
  
  /** Specifies the weighted value of a constraint for speech recognition. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability")
  @js.native
  object SpeechRecognitionConstraintProbability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.default & Double = js.native
    
    /* 2 */ val max: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.max & Double = js.native
    
    /* 1 */ val min: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.min & Double = js.native
  }
  
  /** Specifies the type of pre-defined grammar constraint used for speech recognition. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType")
  @js.native
  object SpeechRecognitionConstraintType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType & Double
      ] = js.native
    
    /* 2 */ val grammar: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.grammar & Double = js.native
    
    /* 1 */ val list: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.list & Double = js.native
    
    /* 0 */ val topic: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.topic & Double = js.native
    
    /* 3 */ val voiceCommandDefinition: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.voiceCommandDefinition & Double = js.native
  }
  
  /** A constraint for a SpeechRecognizer object based on a Speech Recognition Grammar Specification (SRGS) file. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint")
  @js.native
  open class SpeechRecognitionGrammarFileConstraint protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint {
    /**
      * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object.
      * @param file An object representing a SRGS grammar file.
      */
    def this(file: StorageFile) = this()
    /**
      * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object and a tag.
      * @param file An object representing a SRGS grammar file.
      * @param tag The tag to assign to the constraint.
      */
    def this(file: StorageFile, tag: String) = this()
    
    /** Gets the StorageFile object representing the Speech Recognition Grammar Specification (SRGS) grammar file. */
    /* CompleteClass */
    var grammarFile: StorageFile = js.native
    
    /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets or sets the weighted value of the constraint. */
    /* CompleteClass */
    var probability: SpeechRecognitionConstraintProbability = js.native
    
    /** Gets or sets a tag that can be useful for identifying the constraint. */
    /* CompleteClass */
    var tag: String = js.native
    
    /** Gets the type of the constraint. */
    /* CompleteClass */
    var `type`: SpeechRecognitionConstraintType = js.native
  }
  
  /** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis")
  @js.native
  open class SpeechRecognitionHypothesis ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis {
    
    /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs")
  @js.native
  open class SpeechRecognitionHypothesisGeneratedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs {
    
    /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
    /* CompleteClass */
    var hypothesis: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis = js.native
  }
  
  /** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint")
  @js.native
  open class SpeechRecognitionListConstraint protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint {
    /**
      * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases.
      * @param commands A string array of words or phrases that make up the constraint.
      */
    def this(commands: IIterable[String]) = this()
    /**
      * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases and a tag.
      * @param commands A string array of words or phrases that make up the constraint.
      * @param tag The tag to assign to the constraint.
      */
    def this(commands: IIterable[String], tag: String) = this()
    
    /** Gets the array of words or phrases that make up the constraint. */
    /* CompleteClass */
    var commands: IVector[String] = js.native
    
    /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets or sets the weighted value of the constraint. */
    /* CompleteClass */
    var probability: SpeechRecognitionConstraintProbability = js.native
    
    /** Gets or sets a tag that can be useful for identifying the constraint. */
    /* CompleteClass */
    var tag: String = js.native
    
    /** Gets the type of the constraint. */
    /* CompleteClass */
    var `type`: SpeechRecognitionConstraintType = js.native
  }
  
  /** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs")
  @js.native
  open class SpeechRecognitionQualityDegradingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs {
    
    /** Gets the audio problem that occurred. */
    /* CompleteClass */
    var problem: SpeechRecognitionAudioProblem = js.native
  }
  
  /** The result of a speech recognition session. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResult")
  @js.native
  open class SpeechRecognitionResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult {
    
    /** Gets a value that indicates the confidence of the speech recognizer in the recognition result. */
    /* CompleteClass */
    var confidence: SpeechRecognitionConfidence = js.native
    
    /** Gets the constraint that was triggered to return the recognized phrase. */
    /* CompleteClass */
    var constraint: ISpeechRecognitionConstraint = js.native
    
    /**
      * Gets a collection of recognition result alternatives, ordered by RawConfidence from most likely to least likely. The first item in the collection is the recognition result indicated by the parent object.
      * @param maxAlternates The maximum number of speech recognition results to return in the collection.
      * @return A collection of speech recognition results, ordered by confidence from most likely to least likely.
      */
    /* CompleteClass */
    override def getAlternates(maxAlternates: Double): IVectorView[typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult] = js.native
    
    /** Gets the amount of time required for the utterance. */
    /* CompleteClass */
    var phraseDuration: Double = js.native
    
    /** Gets the start time of the utterance. */
    /* CompleteClass */
    var phraseStartTime: js.Date = js.native
    
    /** Gets a value that indicates the relative confidence of the SpeechRecognitionResult when compared with a collection of alternatives returned with the recognition result. */
    /* CompleteClass */
    var rawConfidence: Double = js.native
    
    /** Gets the hierarchy of rule elements that were triggered to return the recognized phrase. */
    /* CompleteClass */
    var rulePath: IVectorView[String] = js.native
    
    /** Gets an interpretation object containing the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
    /* CompleteClass */
    var semanticInterpretation: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation = js.native
    
    /** Gets the result state ( SpeechRecognitionResultStatus ) of a speech recognition session. */
    /* CompleteClass */
    var status: SpeechRecognitionResultStatus = js.native
    
    /** Gets the recognized phrase of the speech recognition session. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Specifies the possible result states of a speech recognition session or from the compiling of grammar constraints. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus")
  @js.native
  object SpeechRecognitionResultStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus & Double
      ] = js.native
    
    /* 4 */ val audioQualityFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.audioQualityFailure & Double = js.native
    
    /* 3 */ val grammarCompilationFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarCompilationFailure & Double = js.native
    
    /* 2 */ val grammarLanguageMismatch: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarLanguageMismatch & Double = js.native
    
    /* 10 */ val microphoneUnavailable: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.microphoneUnavailable & Double = js.native
    
    /* 9 */ val networkFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.networkFailure & Double = js.native
    
    /* 8 */ val pauseLimitExceeded: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.pauseLimitExceeded & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.success & Double = js.native
    
    /* 7 */ val timeoutExceeded: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.timeoutExceeded & Double = js.native
    
    /* 1 */ val topicLanguageNotSupported: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.topicLanguageNotSupported & Double = js.native
    
    /* 6 */ val unknown: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.unknown & Double = js.native
    
    /* 5 */ val userCanceled: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.userCanceled & Double = js.native
  }
  
  /** Specifies the scenario used to optimize speech recognition for a web-service constraint (created through a SpeechRecognitionTopicConstraint object). */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionScenario")
  @js.native
  object SpeechRecognitionScenario extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario & Double
      ] = js.native
    
    /* 1 */ val dictation: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.dictation & Double = js.native
    
    /* 2 */ val formFilling: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.formFilling & Double = js.native
    
    /* 0 */ val webSearch: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.webSearch & Double = js.native
  }
  
  /** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation")
  @js.native
  open class SpeechRecognitionSemanticInterpretation ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation {
    
    /** Gets a dictionary of the semantic properties. */
    /* CompleteClass */
    var properties: IMapView[String, IVectorView[Any]] = js.native
  }
  
  /** A pre-defined grammar constraint (specifed by SpeechRecognitionScenario ) provided through a web service. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint")
  @js.native
  open class SpeechRecognitionTopicConstraint protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint {
    /**
      * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type and context.
      * @param scenario A predefined scenario type.
      * @param topicHint A subject, or context hint, used to optimize recognition.
      */
    def this(scenario: SpeechRecognitionScenario, topicHint: String) = this()
    /**
      * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type, context, and an identifier.
      * @param scenario A predefined scenario type.
      * @param topicHint A subject, or context hint, used to optimize recognition.
      * @param tag Identifier for the constraint.
      */
    def this(scenario: SpeechRecognitionScenario, topicHint: String, tag: String) = this()
    
    /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets or sets the weighted value of the constraint. */
    /* CompleteClass */
    var probability: SpeechRecognitionConstraintProbability = js.native
    
    /** Gets the predefined scenario type for the constraint. */
    /* CompleteClass */
    var scenario: SpeechRecognitionScenario = js.native
    
    /** Gets or sets a tag that can be useful for identifying the constraint. */
    /* CompleteClass */
    var tag: String = js.native
    
    /** Gets the topic hint for the constraint. */
    /* CompleteClass */
    var topicHint: String = js.native
    
    /** Gets the type of the constraint. */
    /* CompleteClass */
    var `type`: SpeechRecognitionConstraintType = js.native
  }
  
  /** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint")
  @js.native
  open class SpeechRecognitionVoiceCommandDefinitionConstraint ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint {
    
    /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets or sets the weighted value of the constraint. */
    /* CompleteClass */
    var probability: SpeechRecognitionConstraintProbability = js.native
    
    /** Gets or sets a tag that can be useful for identifying the constraint. */
    /* CompleteClass */
    var tag: String = js.native
    
    /** Gets the type of the constraint. */
    /* CompleteClass */
    var `type`: SpeechRecognitionConstraintType = js.native
  }
  
  /** Enables speech recognition with either a default or a custom graphical user interface (GUI). */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
  @js.native
  /** Creates a new instance of the SpeechRecognizer class. */
  open class SpeechRecognizer ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizer {
    /**
      * Creates a new instance of the SpeechRecognizer class with a language specifier.
      * @param language The spoken language to use for recognition.
      */
    def this(language: Language) = this()
  }
  object SpeechRecognizer {
    
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the collection of languages supported by the custom grammars of the SpeechRecognitionGrammarFileConstraint and SpeechRecognitionListConstraint objects specified in the Constraints property. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.supportedGrammarLanguages")
    @js.native
    def supportedGrammarLanguages: IVectorView[Language] = js.native
    inline def supportedGrammarLanguages_=(x: IVectorView[Language]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedGrammarLanguages")(x.asInstanceOf[js.Any])
    
    /** Gets the collection of languages supported by the pre-defined, web-service grammars of the SpeechRecognitionTopicConstraint objects specified in the Constraints property. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.supportedTopicLanguages")
    @js.native
    def supportedTopicLanguages: IVectorView[Language] = js.native
    inline def supportedTopicLanguages_=(x: IVectorView[Language]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTopicLanguages")(x.asInstanceOf[js.Any])
    
    /** Gets the language of the device specified in Settings > Time & Language > Speech. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.systemSpeechLanguage")
    @js.native
    def systemSpeechLanguage: Language = js.native
    inline def systemSpeechLanguage_=(x: Language): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemSpeechLanguage")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the state of the speech recognizer. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerState")
  @js.native
  object SpeechRecognizerState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState & Double] = js.native
    
    /* 1 */ val capturing: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.capturing & Double = js.native
    
    /* 0 */ val idle: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.idle & Double = js.native
    
    /* 6 */ val paused: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.paused & Double = js.native
    
    /* 2 */ val processing: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.processing & Double = js.native
    
    /* 4 */ val soundEnded: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundEnded & Double = js.native
    
    /* 3 */ val soundStarted: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundStarted & Double = js.native
    
    /* 5 */ val speechDetected: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.speechDetected & Double = js.native
  }
  
  /** Provides data for the SpeechRecognizer.StateChangedEvent event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs")
  @js.native
  open class SpeechRecognizerStateChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs {
    
    /** Gets the audio capture state. */
    /* CompleteClass */
    var state: SpeechRecognizerState = js.native
  }
  
  /** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts")
  @js.native
  open class SpeechRecognizerTimeouts ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts {
    
    /** Gets and sets the length of time that a SpeechRecognizer continues to listen while receiving unrecognizable sounds (babble) before it assumes speech input has ended and finalizes the recognition operation. */
    /* CompleteClass */
    var babbleTimeout: Double = js.native
    
    /** Gets and sets the length of time, after recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
    /* CompleteClass */
    var endSilenceTimeout: Double = js.native
    
    /** Gets and sets the length of time, before any recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
    /* CompleteClass */
    var initialSilenceTimeout: Double = js.native
  }
  
  /** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
  /* note: abstract class */ @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions")
  @js.native
  open class SpeechRecognizerUIOptions ()
    extends StObject
       with typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions {
    
    /** Gets or sets the heading text that is displayed on the Listening screen. The default is "Listening...". */
    /* CompleteClass */
    var audiblePrompt: String = js.native
    
    /** Gets or sets the example text shown on the Listening screen. */
    /* CompleteClass */
    var exampleText: String = js.native
    
    /** Gets or sets whether the recognized text is spoken back to the user on the Heard you say screen. */
    /* CompleteClass */
    var isReadBackEnabled: Boolean = js.native
    
    /** Gets or sets whether a Heard you say screen is shown to the user after speech recognition is completed. */
    /* CompleteClass */
    var showConfirmation: Boolean = js.native
  }
}
