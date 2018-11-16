```
// Type definitions for verror 1.10
// Project: https://github.com/davepacheco/node-verror
// Definitions by: Sven Reglitzki <https://github.com/svi3c>, Maxime Toumi-M <https://github.com/max4t>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/*
 * VError([cause], fmt[, arg...]): Like JavaScript's built-in Error class, but
 * supports a "cause" argument (another error) and a printf-style message.  The
 * cause argument can be null or omitted entirely.
 *
 * Examples:
 *
 * CODE                                    MESSAGE
 * new VError('something bad happened')    "something bad happened"
 * new VError('missing file: "%s"', file)  "missing file: "/etc/passwd"
 *   with file = '/etc/passwd'
 * new VError(err, 'open failed')          "open failed: file not found"
 *   with err.message = 'file not found'
 */
```