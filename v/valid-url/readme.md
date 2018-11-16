```
// Type definitions for valid-url v1.0.9
// Project: https://github.com/ogt/valid-url
// Definitions by: Steve Hipwell <https://github.com/stevehipwell>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * Is the value a well-formed uri?
 * Returns the untainted URI if the test value appears to be well-formed.  Note that you may really want one of the more practical methods like is_http_uri or is_https_uri, since the URI standard (RFC 3986) allows a lot of things you probably don't want.
 * @param {string} value - The potential URI to test.
 * @returns {string} - The untainted RFC 3986 URI on success, undefined on failure.
 */
```